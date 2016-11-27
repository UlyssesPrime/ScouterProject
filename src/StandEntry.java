/**
 * @author Jack
 */
public final class StandEntry {

	public final String teamName;
	public final String teamNumber;

	public final int finalScore;

	//What was done in autonomous
	public final boolean drive, cross, scoreHigh, scoreLow;

	//Defenses crossed in tele-op
	public final int portcullis, cdf, ramparts, moat, drawBridge, roughTerrain, rockWall, lowBar;

	//Scoring in tele-op
	public final int highGoalAttempts, highGoalScoring, lowGoalAttempts, lowGoalScoring;
	public final boolean didScale;

	private StandEntry(final String teamName, final String teamNumber, boolean drive, boolean cross,
									 	 boolean scoreHigh, boolean scoreLow, int portcullis, int cdf, int moat,
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

	public StandEntry(final String teamName, final String teamNumber, boolean autoBools[], int scoring[], boolean didScale){
									 		 this(teamName, teamNumber, autoBools[0], autoBools[1], autoBools[2], autoBools[3], scoring[0], scoring[1],
											 			scoring[2], scoring[3], scoring[4], scoring[5], scoring[6], scoring[7], scoring[8], scoring[9], scoring[10],
														didScale);
										 }

	@Override
	public String toString(){
		return String.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s",
												 this.teamName,this.teamNumber, this.drive, this.cross, this.scoreHigh, this.scoreLow,
												 this.portcullis, this.cdf, this.moat, this.drawBridge, this.roughTerrain, this.rockWall,
												 this.lowBar, this.highGoalAttempts, this.highGoalScoring, this.lowGoalAttempts,
												 this.lowGoalScoring, this.didScale);

	}
	public static void main(String[] args){
	  boolean eh[] = {true, true, true, true};
	  int nums[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
		StandEntry entry = new StandEntry("Voltage", "386", eh, nums, true);
		System.out.println(entry);
	}
}
