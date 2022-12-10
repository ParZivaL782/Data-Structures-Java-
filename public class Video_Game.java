public class Video_Game
{
    String name;
    String Rating;
    String Genre;

    public Video_Game(String name,String Rating,String Genre)
    {
        this.name=name;
        this.Rating=Rating;
        this.Genre=Genre;
    }

    public void Introduce()
    {
        Syatem.out.println("HEllo name of the game is "+name+" and it a "+Rating+"game."+"whose basic genre is "+Genre);
    }



    public static void main(String args[])
    {
        Video_Game Dota2=new Video_Game("Dota 2","AAA","RPG");
        Dota2.Introduce();
    }
}