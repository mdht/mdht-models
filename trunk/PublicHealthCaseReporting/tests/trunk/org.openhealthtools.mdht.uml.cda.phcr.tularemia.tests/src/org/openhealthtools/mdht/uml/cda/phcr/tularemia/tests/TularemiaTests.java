/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.tests;


import junit.framework.JUnit4TestAdapter;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>tularemia</b></em>' package.
 * <!-- end-user-doc -->
 * 		

 * @generated
 */
 @RunWith(Suite.class)
@Suite.SuiteClasses({
  	TularemiaCaseReportTest.class
  	,TularemiaPHCRSocialHistorySectionTest.class
  	,TularemiaPossibleExposureLocationAndTypeActTest.class
  	,TularemiaPHCRClinicalInformationSectionTest.class
  	,TularemiaCaseObservationTest.class
  	,TularemiaSignsAndSymptomsObservationTest.class
  	,LocationOfLesionObservationTest.class
  	,TularemiaPHCRTreatmentInformationSectionTest.class
  	,TularemiaTherapeuticRegimenActTest.class
  	,TularemiaTreatmentGivenSubstanceAdministrationTest.class
  	,TularemiaTreatmentNotGivenSubstanceAdministrationTest.class
  	,TularemiaPHCRRelevantDxTestsSectionTest.class
  	,TularemiaResultOrganizerTest.class
  	,TularemiaResultObservationTest.class
})
public class TularemiaTests {

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static junit.framework.Test suite() {
    return new JUnit4TestAdapter( TularemiaTests.class);
  }
	 

} //TularemiaTests