/**
 * @author Jack
 */
public final class StandEntry {
	
	public final String teamName;
	public final String teamNumber;
	
	public int finalScore;
	
	//What was done in autonomous
	public boolean drive, cross, scoreHigh, scoreLow;
	
	//Defenses crossed in tele-op
	public int portcullis, cdf, ramparts, moat, drawBridge, roughTerrain, rockWall, lowBar;
	
	//Scoring in tele-op
	public int highGoalAttempts, highGoalScoring, lowGoalAttempts, lowGoalScoring;
	public boolean didScale;


	
}
