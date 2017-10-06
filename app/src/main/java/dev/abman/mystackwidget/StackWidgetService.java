package dev.abman.mystackwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by adul on 03/10/17.
 */

public class StackWidgetService extends RemoteViewsService {

    @Override
    public RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}
