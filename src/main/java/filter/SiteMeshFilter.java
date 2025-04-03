package filter;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;

public class SiteMeshFilter extends ConfigurableSiteMeshFilter  {
	@Override
    protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
        // Áp dụng decorator cho toàn bộ ứng dụng
        builder.addDecoratorPath("/*", "layout.jsp")
        		.addDecoratorPath("/admin/*", "admin/admin.jsp");
        
        // Exclude các đường dẫn tĩnh như hình ảnh, CSS, JS khỏi việc bị bọc layout
        builder.addExcludedPath("/static/*");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        super.init(filterConfig);
    }
}
