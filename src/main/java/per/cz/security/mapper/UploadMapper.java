package per.cz.security.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import per.cz.security.entity.Qiniu;

/**
 * Created by Administrator on 2020/5/25.
 */
@Mapper
public interface UploadMapper extends BaseMapper<Qiniu>{
}
