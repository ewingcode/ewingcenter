package business.dao;

import java.util.List;

import jdbc.BaseDao;
import jws.dal.sqlbuilder.Condition;
import jws.dal.sqlbuilder.Sort;
import business.ddl.WebResource;
import constants.IsEff;
import constants.IsHot;
import constants.IsOnline;

/**
 * 资源DAO类
 * 
 * @author tanson lam
 * @createDate 2015年3月13日
 * 
 */
public class WebResourceDao extends BaseDao {

    /**
     * 获取资源信息，支持分页获取数据
     * 
     * @param isHot 是否热门资源
     * @param page
     * @param pageSize
     * 
     * @return
     */
    public static List<WebResource> pageQueryHotResource(IsHot isHot, Integer page, Integer pageSize) {
        Condition condition = new Condition("WebResource.iseff", "=", IsEff.EFFECTIVE.getValue());
        condition.add(new Condition("WebResource.isHot", "=", isHot.getValue()), "AND");
        condition
                .add(new Condition("WebResource.isOnline", "=", IsOnline.ONLINE.getValue()), "AND");
        Sort sort = new Sort("WebResource.lastUpdate", false);
        return list(WebResource.class, condition, sort, page, pageSize);
    }

}
