package laptenkov;

/**
 * Класс {@link MusicBox} для воспроизведения музыки различных
 * жанров. Музыка выбирается случайно внутри жанра.
 * При начале проигрывания озвучиваются жанр, автор и название песни.
 * @author habatoo
 */
public class MusicBox {
    private Music music;

    public MusicBox(Music music) {
        this.music = music;
    }

    /**
     *
     */
    public void play() {
        System.out.println(music.play());
    }

}
