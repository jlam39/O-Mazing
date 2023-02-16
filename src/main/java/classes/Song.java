package classes;

// Import Libraries
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public final class Song {
	private final Map<String, MediaPlayer> players; //grabs a string to read for audio

	private static class AudioPlayerInit {
		public static final Song INSTANCE = new Song(); 
	}

	private Song() {
		final JFXPanel fxPanel = new JFXPanel();
		players = new HashMap<String, MediaPlayer>();
	}

	//audio player constructor
	public static Song getInstance() {
		return AudioPlayerInit.INSTANCE;
	}

	// grabs song from a folder
	public void playSound(String folder, String filename) {
		playSound(folder, filename, true);
	}

	// plays the actual song
	public void playSound(String folder, String filename, boolean shouldLoop) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				playSoundWithOptions(folder, filename, shouldLoop);
			}
		});
	}

	private void playSoundWithOptions(String folder, String filename, boolean shouldLoop) {
		MediaPlayer mPlayer = findSound(folder, filename);
		if (mPlayer == null || mPlayer.getCycleDuration().lessThanOrEqualTo(mPlayer.getCurrentTime())) {
			mPlayer = createMediaPlayer(folder, filename);
		}
		mPlayer.play();
		if (shouldLoop) {
			mPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		}
	}

	private MediaPlayer createMediaPlayer(String folder, String filename) {
		String key = buildResourcePath(folder, filename);
		Media sound = new Media(key);
		MediaPlayer mPlayer = new MediaPlayer(sound);
		players.put(folder + filename, mPlayer);
		return mPlayer;
	}

	// latest package code
	private String buildResourcePath(String folder, String filename) {
		if (folder != null && folder.length() > 0) {
			folder += "/";
		}
		final URL resource = getClass().getClassLoader().getResource(folder + filename);
		try {
			return resource.toString();
		} catch (NullPointerException ex) {
			try {
				final URL newResource = getClass().getClassLoader().getResource("../" + folder + filename);
				return newResource.toString();
			} catch (NullPointerException ex1) {
				ex.printStackTrace();
				System.out.println("MEDIA FILE NOT FOUND: " + folder + filename);
				System.out.println("Also tried: ../" + folder + filename + "...Exiting");
				System.exit(0);
			}

		}
		return resource.toString();
	}

	public MediaPlayer findSound(String folder, String filename) {
		return players.get(folder + filename);
	}

	// stops music playing
	public void stopSound(String folder, String filename) {
		Platform.runLater(new Runnable() {
			public void run() {
				MediaPlayer sound = findSound(folder, filename);
				if (sound != null) {
					sound.stop();
				}
			}
		});
	}

	// pauses the music
	public void pauseSound(String folder, String filename) {
		Platform.runLater(new Runnable() {
			public void run() {
				MediaPlayer sound = findSound(folder, filename);
				if (sound != null) {
					sound.pause();
				}
			}
		}); 
	}
}