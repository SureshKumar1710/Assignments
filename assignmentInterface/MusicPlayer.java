package assignmentInterface;

interface Playable 
{
    void play();
    void pause();
    void stop();
}

class MP3Player implements Playable 
{
    public void play() 
    {
        System.out.println("MP3 Player is playing music.");
    }

    public void pause() 
    {
        System.out.println("MP3 Player is paused.");
    }

    public void stop() 
    {
        System.out.println("MP3 Player has stopped playing.");
    }
}

class CDPlayer implements Playable 
{
    public void play() 
    {
        System.out.println("CD Player is playing music.");
    }

    public void pause() 
    {
        System.out.println("CD Player is paused.");
    }

    public void stop() 
    {
        System.out.println("CD Player has stopped playing.");
    }
}

class StreamingPlayer implements Playable 
{
    public void play() 
    {
        System.out.println("Streaming Player is playing music.");
    }

    public void pause() 
    {
        System.out.println("Streaming Player is paused.");
    }

    public void stop() 
    {
        System.out.println("Streaming Player has stopped playing.");
    }
}


public class MusicPlayer 
{
    public static void main(String[] args) 
    {
        Playable mp3Player = new MP3Player();
        Playable cdPlayer = new CDPlayer();
        Playable streamingPlayer = new StreamingPlayer();

        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();
        System.out.println();

        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();
        System.out.println();

        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
    }
}

