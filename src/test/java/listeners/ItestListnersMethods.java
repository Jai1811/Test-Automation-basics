package listeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.IReporter;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.ITestAnnotation;
import org.testng.xml.XmlSuite;

public class ItestListnersMethods implements ITestListener,IReporter,ISuiteListener, IInvokedMethodListener, IRetryAnalyzer, IAnnotationTransformer{
	/**
	 * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
	 * filled with the references to class, method, start millis and status.
	 *
	 * @param result the partially filled <code>ITestResult</code>
	 * @see ITestResult#STARTED
	 */

	public void onTestStart(ITestResult result) {


		System.out.println("OnTestStart....."+result.getName());

	}
	/**
	 * Invoked each time a test succeeds.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 * @see ITestResult#SUCCESS
	 */
	public void onTestSuccess(ITestResult result) {
		System.out.println("OnTestSuccess....."+result.getName());
	}

	/**
	 * Invoked each time a test fails.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 * @see ITestResult#FAILURE
	 */
	public void onTestFailure(ITestResult result) {
		System.out.println("ONTestFailure....."+result.getName());
	}

	/**
	 * Invoked each time a test is skipped.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 * @see ITestResult#SKIP
	 */
	public void onTestSkipped(ITestResult result) {
		System.out.println("OnTestSkipped....."+result.getName());
	}

	/**
	 * Invoked each time a method fails but has been annotated with successPercentage and this failure
	 * still keeps it within the success percentage requested.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
	 */
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("OnTestFailedbutwithPercentage....."+result.getName());
	}

	/**
	 * Invoked each time a test fails due to a timeout.
	 *
	 * @param result <code>ITestResult</code> containing information about the run test
	 */
	public void onTestFailedWithTimeout(ITestResult result) {
		onTestFailure(result);
	}

	/**
	 * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt; tag
	 * and calling all their Configuration methods.
	 */
	public void onStart(ITestContext context) {
		System.out.println("OnTextStartContext....."+context.getName());
	}

	/**
	 * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have run
	 * and all their Configuration methods have been called.
	 */
	public void onFinish(ITestContext context) {
		System.out.println("OnTextFinishContext....."+context.getName());
	}
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites,
			String outputDirectory) {



		System.out.println("XMl Suites : "+ xmlSuites);
		System.out.println(" ISuite suites :"+ suites);

		//Iterate over every suite assigned for execution
		for (ISuite suite : suites) {

			String suiteName = suite.getName();
			System.out.println("Current SuiteName :"+suiteName);
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			System.out.println("suite.getResults()<MAP<String, ISuiteResults> : "+suite.getResults());
			for (ISuiteResult sr : suiteResults.values()) {
				System.out.println("current ISuiteResults : "+sr);
				ITestContext tc = sr.getTestContext();
				System.out.println("Passed tests for suite '" + suiteName +
						"' is:" + tc.getPassedTests().getAllResults().size());
				System.out.println("Failed tests for suite '" + suiteName +
						"' is:" + tc.getFailedTests().getAllResults().size());
				System.out.println("Skipped tests for suite '" + suiteName +
						"' is:" + tc.getSkippedTests().getAllResults().size());
			}
		}



	}
	public void onStart(ISuite suite) { 
		System.out.println("onStart function started "  + suite.getName());
	}
	public void onFinish(ISuite suite) {
		System.out.println("onFinish function started "  + suite.getName());
	} 


	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {

		System.out.println("Before Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass()); 
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {

		System.out.println("After Invocation Method Started For: " + method.getTestMethod().getMethodName() + "of Class:" + testResult.getTestClass());

	}
	public boolean retry(ITestResult result) {
		
		int counter = 0;
		int retryLimit = 4;
	 
			 if(counter < retryLimit)
			 {
			 counter++;
			 return true;
			 }
			 return false;
			 }
	
	
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		 annotation.setRetryAnalyzer(ItestListnersMethods.class);
		 }
	
	}



