import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;

import java.awt.*;
import java.util.List;
import javax.swing.JMenuItem;
import java.util.stream.Collectors;


public class BatchRepeater implements BurpExtension{
    private MontoyaApi api;


    @Override
    public void initialize(MontoyaApi api) {
        this.api = api;

        api.extension().setName("BatchRepeater");
        api.logging().logToOutput("BatchRepeater Initialized");

        api.userInterface().registerContextMenuItemsProvider(new BatchRepeaterContextMenu());
    }


    private class BatchRepeaterContextMenu implements ContextMenuItemsProvider{
        @Override
        public List<Component> provideMenuItems(ContextMenuEvent event){
            JMenuItem sendToRepeaterItem = new JMenuItem("Send all to Repeater");
            sendToRepeaterItem.addActionListener(e -> sendToRepeater(event));

            return List.of(sendToRepeaterItem);
        }

        private void sendToRepeater(ContextMenuEvent event){

            List<HttpRequestResponse> selectedItems = event.selectedRequestResponses().stream()
                    .collect(Collectors.toList());

            for (HttpRequestResponse item : selectedItems) {
                api.repeater().sendToRepeater(item.request());

            }
        }
    }

}