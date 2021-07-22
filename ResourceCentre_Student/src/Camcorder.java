
public class Camcorder extends Item{
	private int opticalZoom;

	public Camcorder(String assetTag, String description, int opticalZoom) {
		super(assetTag, description);
		this.opticalZoom = opticalZoom;
	}

	public int getOpticalZoom() {
		return opticalZoom;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		output += "Camcorder: " + this.getAssetTag() + "/nDescription: " +  this.getDescription() + "/nOptical Zoom: " + this.getOpticalZoom();
		return output;
	}
}

