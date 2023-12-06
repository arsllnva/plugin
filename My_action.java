import com.intellij.ide.BrowserUtil;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import org.jetbrains.annotations.NotNull;

public class My_action extends AnAction {

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        BrowserUtil.browse( "https://abit.itmo.ru/program/bachelor/software_engineering");

    }
}
