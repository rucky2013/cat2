package org.unidal.cat.core.config.page.service;

import org.unidal.cat.core.config.page.ConfigPage;
import org.unidal.web.mvc.view.BaseJspViewer;

public class JspViewer extends BaseJspViewer<ConfigPage, Action, Context, Model> {
   @Override
   protected String getJspFilePath(Context ctx, Model model) {
      Action action = model.getAction();

      switch (action) {
      case VIEW:
         return JspFile.VIEW.getPath();
      default:
         break;
      }

      throw new RuntimeException("Unknown action: " + action);
   }
}
