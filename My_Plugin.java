import ij.*;
import ij.process.*;
import ij.gui.*;
import java.awt.*;
import ij.plugin.*;
import ij.plugin.frame.*;

public class My_Plugin implements PlugIn {

	public void run(String arg) {
		ImagePlus imp = IJ.getImage();
		IJ.run(imp, "Invert", "");
		IJ.wait(10000);
		IJ.run(imp, "Invert", "");
	}

}
