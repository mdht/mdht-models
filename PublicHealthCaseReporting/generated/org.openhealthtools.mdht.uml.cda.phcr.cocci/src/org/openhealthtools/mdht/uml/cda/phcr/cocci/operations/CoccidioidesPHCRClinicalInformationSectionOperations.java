/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.cocci.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPackage;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CocciPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesImmunosuppressedMedicalConditionHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Immunosuppressed Medical Condition History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#getCoccidioidesCaseObservation() <em>Get Coccidioides Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations() <em>Get Coccidioides Immunosuppressed Medical Condition History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesPHCRClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param coccidioidesPHCRClinicalInformationSection The receiving '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_CASE_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesCaseObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRClinicalInformationSection, context) }),
             new Object [] { coccidioidesPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Immunosuppressed Medical Condition History Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Clinical Information Section Coccidioides Immunosuppressed Medical Condition History Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param coccidioidesPHCRClinicalInformationSection The receiving '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPHCRClinicalInformationSectionCoccidioidesImmunosuppressedMedicalConditionHistoryObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRClinicalInformationSection, context) }),
             new Object [] { coccidioidesPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection) <em>Get Coccidioides Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesCaseObservation))->asSequence()->any(true).oclAsType(cocci::CoccidioidesCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection) <em>Get Coccidioides Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesCaseObservation))->asSequence()->any(true).oclAsType(cocci::CoccidioidesCaseObservation)
   * @param coccidioidesPHCRClinicalInformationSection The receiving '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  CoccidioidesCaseObservation getCoccidioidesCaseObservation(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection) {
    if (GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(71));
      try
      {
        GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_CASE_OBSERVATION__EOCL_QRY);
    return (CoccidioidesCaseObservation) query.evaluate(coccidioidesPHCRClinicalInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations(CoccidioidesPHCRClinicalInformationSection) <em>Get Coccidioides Immunosuppressed Medical Condition History Observations</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations(CoccidioidesPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)).oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations(CoccidioidesPHCRClinicalInformationSection) <em>Get Coccidioides Immunosuppressed Medical Condition History Observations</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations(CoccidioidesPHCRClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)).oclAsType(cocci::CoccidioidesImmunosuppressedMedicalConditionHistoryObservation)
   * @param coccidioidesPHCRClinicalInformationSection The receiving '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation> getCoccidioidesImmunosuppressedMedicalConditionHistoryObservations(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection) {
    if (GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(72));
      try
      {
        GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_IMMUNOSUPPRESSED_MEDICAL_CONDITION_HISTORY_OBSERVATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation> result = (Collection<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation>) query.evaluate(coccidioidesPHCRClinicalInformationSection);
    return new BasicEList.UnmodifiableEList<CoccidioidesImmunosuppressedMedicalConditionHistoryObservation>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.30')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.30')
   * @param coccidioidesPHCRClinicalInformationSection The receiving '<em><b>Coccidioides PHCR Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(CoccidioidesPHCRClinicalInformationSection coccidioidesPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRClinicalInformationSection, context) }),
             new Object [] { coccidioidesPHCRClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

} // CoccidioidesPHCRClinicalInformationSectionOperations