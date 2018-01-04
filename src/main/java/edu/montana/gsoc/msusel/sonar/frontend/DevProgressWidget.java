/**
 * The MIT License (MIT)
 *
 * MSUSEL Front End Sonar Plugin
 * Copyright (c) 2015-2018 Montana State University, Gianforte School of Computing,
 * Software Engineering Laboratory
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package edu.montana.gsoc.msusel.sonar.frontend;

import org.sonar.api.web.AbstractRubyTemplate;
import org.sonar.api.web.Description;
import org.sonar.api.web.RubyRailsWidget;
import org.sonar.api.web.UserRole;
import org.sonar.api.web.WidgetProperties;
import org.sonar.api.web.WidgetProperty;
import org.sonar.api.web.WidgetPropertyType;

/**
 * Ruby on Rails DevProgress widget used to monitor developer progress as a
 * function of functionality and productivity.
 * 
 * @author Isaac Griffith
 * @version 1.1.1
 */
@UserRole(UserRole.USER)
@Description("MSUSEL Developer Progress Display")
@WidgetProperties({
        @WidgetProperty(key = "functionalityMetric", defaultValue = "sc_progress_functionality", type = WidgetPropertyType.METRIC, description = "Metric for functionality completed.", optional = false),
        @WidgetProperty(key = "productivityMetric", defaultValue = "sc_progress_productivity", type = WidgetPropertyType.METRIC, description = "Metric for productivitity", optional = false),
        @WidgetProperty(key = "issuesMetric", defaultValue = "sc_progress_issues", type = WidgetPropertyType.METRIC, description = "Count of issues.", optional = false) })
public class DevProgressWidget extends AbstractRubyTemplate implements RubyRailsWidget {

    private static final String ID            = "msusel_dev_progress_widget";
    private static final String TITLE         = "MSUSEL Developer Progress Summary";
    private static final String TEMPLATE_PATH = "/edu/montana/gsoc/msusel/sonar/frontend/dev_progress.html.erb";

    /**
     * {@inheritDoc}
     */
    @Override
    public String getId()
    {
        return ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected String getTemplatePath()
    {
        return TEMPLATE_PATH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getTitle()
    {
        return TITLE;
    }
}
