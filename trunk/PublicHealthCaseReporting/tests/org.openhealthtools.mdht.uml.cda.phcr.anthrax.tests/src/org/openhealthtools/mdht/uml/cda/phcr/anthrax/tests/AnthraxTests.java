/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>anthrax</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	AnthraxCaseReportTest.class
  	,AnthraxPhcrSocialHistorySectionTest.class
  	,AnthraxPossibleExpossureLocationAndTypeActTest.class
  	,AnthraxPhcrClinicalInformationSectionTest.class
  	,AnthraxCaseObservationTest.class
  	,AnthraxSignsAndSymptomsObservationTest.class
  	,AnthraxPhcrTreatmentInformationSectionTest.class
  	,AnthraxTherapeuticRegimenActTest.class
  	,AnthraxTreatmentGivenSubstanceAdministrationTest.class
  	,AnthraxTreatmentNotGivenSubstanceAdministrationTest.class
  	,AnthraxPhcrRelevantDxTestsSectionTest.class
  	,AnthraxResultOrganizerTest.class
  	,AnthraxResultObservationTest.class
})
public class AnthraxTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( AnthraxTests.class);
  }
	 

} //AnthraxTests