package joelhandwell.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.*;

public class HelloWorld implements EntryPoint {
    public void onModuleLoad() {
        RootLayoutPanel.get().add(new Label("Hello World"));
    }
}
