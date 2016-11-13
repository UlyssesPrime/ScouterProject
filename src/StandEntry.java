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

	public StandEntry(final String teamName, final String teamNumber, final boolean drive, final boolean cross,
									   final boolean scoreHigh, final boolean scoreLow, int portcullis, int cdf, int moat,
										 int drawBridge, int roughTerrain, int rockWall, int lowBar, int highGoalAttempts,
										 int highGoalScoring, int lowGoalAttempts, int lowGoalScoring, boolean didScale){
											 this.teamName = teamName;
											 this.teamNumber = teamNumber;
											 this.drive = drive;
											 this.cross = cross;
											 this.scoreHigh = scoreHigh;
											 this.scoreLow = scoreLow;
											 this.portcullis = portcullis;
											 this.cdf = cdf;
											 this.moat = moat;
											 this.drawBridge = drawBridge;
											 this.roughTerrain = roughTerrain;
											 this.rockWall = rockWall;
											 this.lowBar = lowBar;
											 this.highGoalAttempts = highGoalAttempts;
											 this.highGoalScoring = highGoalScoring;
											 this.lowGoalAttempts = lowGoalScoring;
											 this.lowGoalScoring = lowGoalScoring;
											 this.didScale = didScale;
										 }

	@Override
	public String toString(){
		return String.format(this.teamName,this.teamNumber, this.drive, this.cross, this.scoreHigh, this.scoreLow,
												 this.portcullis, this.cdf, this.moat, this.drawBridge, this.roughTerrain, this.rockWall,
												 this.lowBar, this.highGoalAttempts, this.highGoalScoring, this.lowGoalAttempts,
												 this.lowGoalScoring, this.didScale);

	}
	public static void main(String[] args){
	//boolean eh[] = {true, true, true, true};
	//int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		StandEntry entry = new StandEntry("Voltage", "386", true, true, true, true, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, true);
		System.out.println(entry);
	} //FIGURE OUT WHAT THE FUCK IS GOING ON
}
