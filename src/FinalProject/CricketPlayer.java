package FinalProject;

import java.util.Date;

public class CricketPlayer extends Athlete {
    private String playerType;
    private Integer inningPlayed;
    private Integer runsScored;
    private Integer runsGiven;

    private Integer ballsFaced;
    private Integer ballsBowled;

    public CricketPlayer(String name, Integer age, Date birthDate,
                         String gender, String playerType,
                         Integer inningPlayed, Integer runsScored,
                         Integer runsGiven, Integer ballsFaced,
                         Integer ballsBowled)
    {
        super(name, age, birthDate, gender);
        this.playerType = playerType;
        this.inningPlayed = inningPlayed;
        this.runsScored = runsScored;
        this.runsGiven = runsGiven;
        this.ballsFaced = ballsFaced;
        this.ballsBowled = ballsBowled;
    }

    public double StrikeRate(){
        return runsScored/ballsFaced * 100;
    }

    public double runRate(){
        return runsGiven/ballsBowled * 100;
    }
}
