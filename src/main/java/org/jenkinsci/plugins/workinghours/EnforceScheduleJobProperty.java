    /*
 * The MIT License
 *
 * Copyright (c) 2018 GoDaddy Operating Company, LLC.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.workinghours;

import hudson.Extension;
import jenkins.model.OptionalJobProperty;
import org.jenkinsci.Symbol;
import org.jenkinsci.plugins.workflow.job.WorkflowJob;
import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Job property which is used to opt in to build schedules
 * @author jxpearce@godaddy.com
 */
public class EnforceScheduleJobProperty extends OptionalJobProperty<WorkflowJob> {

    /**
     * Constructor
     */
    @DataBoundConstructor
    public EnforceScheduleJobProperty() {
    }
    
    /**
     * Required descriptor
     */
    @Extension(optional = true)
    @Symbol("enforceBuildSchedule")
    public static class DescriptorImpl extends OptionalJobPropertyDescriptor {

        @Override public String getDisplayName() {            
            return Messages.EnforceScheduleJobProperty_DescriptorImpl_DisplayName();
        }

    }


}
