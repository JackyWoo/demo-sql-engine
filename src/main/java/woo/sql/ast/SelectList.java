package woo.sql.ast;

import woo.sql.analyzer.AstVisitor;
import woo.sql.analyzer.Node;

import java.util.List;

/**
 * Created by wujianchao on 2022/11/25.
 */
public class SelectList implements Node {

    List<SelectListItem> itemList;

    public List<SelectListItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<SelectListItem> itemList) {
        this.itemList = itemList;
    }

    @Override
    public <R, C> R accept(AstVisitor<R, C> visitor, C context) {
        return visitor.visitSelectList(this, context);
    }
}
