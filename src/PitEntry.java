/**
 * @author Jack & Jeremy
 */

public final class PitEntry {

	public final String teamName;
	public final String teamNumber;

	//Autonomous capabilities
	public final String autoState;

	//Defense Crossing Capabilities
	public final boolean portcullis,
			cdf,
			ramparts,
			moat,
			drawBridge,
			roughTerrain,
			rockWall,
			lowBar;

	//Scoring capabilities
	public final boolean high, low;
	public final boolean scale;

	public final boolean isDefensive;

	/**
	 * @param teamName
	 * @param teamNumber
	 * @param autoState Possible Inputs: "none", "move", "cross", "shoot"
	 * @param portcullis
	 * @param cdf
	 * @param ramparts
	 * @param moat
	 * @param drawBridge
	 * @param roughTerrain
	 * @param rockWall
	 * @param lowBar
	 * @param high
	 * @param low
	 * @param isDefensive
	 */
	private PitEntry(
			final String teamName,
			final String teamNumber,
			final String autoState,
			final boolean portcullis,
			final boolean cdf,
			final boolean ramparts,
			final boolean moat,
			final boolean drawBridge,
			final boolean roughTerrain,
			final boolean rockWall,
			final boolean lowBar,
			final boolean high,
			final boolean low,
			final boolean scale,
			final boolean isDefensive)
	{
		this.teamName = teamName;
		this.teamNumber = teamNumber;
		this.autoState = autoState;
		this.portcullis = portcullis;
		this.cdf = cdf;
		this.ramparts = ramparts;
		this.moat = moat;
		this.drawBridge = drawBridge;
		this.roughTerrain = roughTerrain;
		this.rockWall = rockWall;
		this.lowBar = lowBar;
		this.high = high;
		this.low = low;
		this.scale = scale;
		this.isDefensive = isDefensive;
	}

	/**
	 * @param theirName
	 * @param theirNum
	 * @param autoState Possible Inputs: "none", "move", "cross", "shoot"
	 * @param teleOp A boolean array with the following structure: portcullis,
			cdf,
			ramparts,
			moat,
			drawBridge,
			roughTerrain,
			rockWall,
			lowBar
	 * @param high
	 * @param low
	 * @param scale
	 * @param isDefensive
	 */
	public PitEntry (
			final String theirName,
			final String theirNum,
			final String autoState,
			final boolean[] teleOp,
			final boolean high,
			final boolean low,
			final boolean scale,
			final boolean isDefensive)
	{
		this(theirName,
				theirNum,
				autoState,
				teleOp[0],
				teleOp[1],
				teleOp[2],
				teleOp[3],
				teleOp[4],
				teleOp[5],
				teleOp[6],
				teleOp[7],
				high,
				low,
				scale,
				isDefensive);
	}

	@Override
	public String toString () {
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
				this.teamName,
				this.teamNumber,
				this.autoState,
				this.portcullis,
				this.cdf,
				this.ramparts,
				this.moat,
				this.drawBridge,
				this.roughTerrain,
				this.rockWall,
				this.lowBar,
				this.high,
				this.low,
				this.scale,
				this.isDefensive);
	}

	//UNIT TEST
	public static void main(final String... args){

		//this is a test
		boolean[] blah = {true,true,true,true,true,true,true,true};
		PitEntry entry = new PitEntry("Voltage", "386", "move", blah,true,true,true,true );
		System.out.println(entry);
	}
}
