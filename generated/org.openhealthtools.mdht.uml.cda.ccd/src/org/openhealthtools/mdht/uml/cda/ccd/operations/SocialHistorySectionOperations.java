/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistoryObservation;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;
import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionMaritalStatus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Marital Status</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionReligiousAffiliation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Religious Affiliation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientRace(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientRaceCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientEthnicity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionPatientEthnicityCodeSystem(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity Code System</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#validateSocialHistorySectionSocialHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection#getSocialHistoryObservations() <em>Get Social History Observations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SocialHistorySectionOperations extends SectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionMaritalStatus(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Marital Status</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionMaritalStatus(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->select(r | not r.patientRole.patient.maritalStatusCode.hasContent() )->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionMaritalStatus(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Marital Status</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionMaritalStatus(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionMaritalStatus(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_MARITAL_STATUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_MARITAL_STATUS,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionMaritalStatus"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionReligiousAffiliation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Religious Affiliation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionReligiousAffiliation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->select(r | not r.patientRole.patient.religiousAffiliationCode.hasContent() )->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionReligiousAffiliation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Religious Affiliation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionReligiousAffiliation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionReligiousAffiliation(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_RELIGIOUS_AFFILIATION,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionReligiousAffiliation"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionPatientRace(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientRace(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->select(r | not r.patientRole.patient.raceCode.hasContent() )->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionPatientRace(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientRace(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionPatientRace(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_RACE,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionPatientRace"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionPatientRaceCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race Code System</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientRaceCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->forAll(r | r.patientRole.patient.raceCode.codeSystem = '2.16.840.1.113883.5.104' )";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionPatientRaceCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Race Code System</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientRaceCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionPatientRaceCodeSystem(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_RACE_CODE_SYSTEM,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionPatientRaceCodeSystem"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionPatientEthnicity(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientEthnicity(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->select(r | not r.patientRole.patient.ethnicGroupCode.hasContent() )->isEmpty()";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionPatientEthnicity(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientEthnicity(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionPatientEthnicity(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionPatientEthnicity"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionPatientEthnicityCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity Code System</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientEthnicityCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getClinicalDocument().recordTarget->forAll(r | r.patientRole.patient.ethnicGroupCode.codeSystem = '2.16.840.1.113883.5.50' )";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionPatientEthnicityCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Patient Ethnicity Code System</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionPatientEthnicityCodeSystem(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionPatientEthnicityCodeSystem(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_PATIENT_ETHNICITY_CODE_SYSTEM,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionPatientEthnicityCodeSystem"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.15')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionTemplateId(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionTemplateId"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "+
"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "+
"value.code = '29762-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionCode(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionCode(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_CODE,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionCode"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTitle(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionTitle(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TITLE,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionTitle"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionText(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionText(SocialHistorySection socialHistorySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEXT,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionText"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(ccd::SocialHistoryObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Social History Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionSocialHistoryObservation(SocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param socialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static boolean validateSocialHistorySectionSocialHistoryObservation(
			SocialHistorySection socialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(socialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             CCDValidator.DIAGNOSTIC_SOURCE,
             CCDValidator.SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_SOCIAL_HISTORY_OBSERVATION,
             CCDPlugin.INSTANCE.getString("SocialHistorySectionSocialHistoryObservation"),
             new Object [] { socialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getSocialHistoryObservations(SocialHistorySection) <em>Get Social History Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistoryObservations(SocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(ccd::SocialHistoryObservation)).oclAsType(ccd::SocialHistoryObservation)";

	/**
   * The cached OCL query for the '{@link #getSocialHistoryObservations(SocialHistorySection) <em>Get Social History Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSocialHistoryObservations(SocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static EList<SocialHistoryObservation> getSocialHistoryObservations(SocialHistorySection socialHistorySection) {
    if (GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CCDPackage.Literals.SOCIAL_HISTORY_SECTION, CCDPackage.Literals.SOCIAL_HISTORY_SECTION.getEAllOperations().get(66));
      try
      {
        GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<SocialHistoryObservation> result = (Collection<SocialHistoryObservation>) query.evaluate(socialHistorySection);
    return new BasicEList.UnmodifiableEList<SocialHistoryObservation>(result.size(), result.toArray());
  }

} // SocialHistorySectionOperations
