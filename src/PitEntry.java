/**
 * @author Jack & Jeremy
 */

public final class PitEntry {

	public final String teamName;
	public final String teamNumber;

	//Autonomous capabilities
	public final boolean nothing;
	public final boolean moves;
	public final boolean crosses;
	public final boolean scoresLow;
	public final boolean scoresHigh;

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
			final boolean nothing,
			final boolean moves,
			final boolean crosses,
			final boolean scoresLow,
			final boolean scoresHigh,
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
		this.nothing = nothing;
        this.moves = moves;
        this.crosses = crosses;
        this.scoresLow = scoresLow;
        this.scoresHigh = scoresHigh;
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
			final boolean[] autonomous,
			final boolean[] teleOp,
			final boolean high,
			final boolean low,
			final boolean scale,
			final boolean isDefensive)
	{
		this(theirName,
				theirNum,
				autonomous[0],
                autonomous[1],
                autonomous[2],
                autonomous[3],
                autonomous[4],
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
		return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
				this.teamName,
				this.teamNumber,
				this.nothing,
                this.moves,
                this.crosses,
                this.scoresLow,
                this.scoresHigh,
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
        boolean[] auto = {true, false, false, false};
		boolean[] blah = {true,true,true,true,true,true,true,true, true, true, true, true, true, true, true};
		PitEntry entry = new PitEntry("Voltage", "386", auto, blah,true,true,true,true );
		System.out.println(entry);
	}
}
