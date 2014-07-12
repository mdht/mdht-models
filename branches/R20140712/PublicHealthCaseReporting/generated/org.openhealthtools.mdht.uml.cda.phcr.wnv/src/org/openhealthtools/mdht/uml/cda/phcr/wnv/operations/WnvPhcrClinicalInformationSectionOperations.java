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
package org.openhealthtools.mdht.uml.cda.phcr.wnv.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPackage;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.wnv.util.WnvValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection#validateWnvPhcrClinicalInformationSectionWnvCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Clinical Information Section Wnv Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection#getWnvCaseObservation() <em>Get Wnv Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.wnv.WnvPhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WnvPhcrClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected WnvPhcrClinicalInformationSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Clinical Information Section Wnv Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(wnv::WnvCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wnv Phcr Clinical Information Section Wnv Case Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(wnv::WnvCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param wnvPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateWnvPhcrClinicalInformationSectionWnvCaseObservation(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvPhcrClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_PHCR_CLINICAL_INFORMATION_SECTION__WNV_PHCR_CLINICAL_INFORMATION_SECTION_WNV_CASE_OBSERVATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateWnvPhcrClinicalInformationSectionWnvCaseObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvPhcrClinicalInformationSection, context) }),
             new Object [] { wnvPhcrClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getWnvCaseObservation(WnvPhcrClinicalInformationSection) <em>Get Wnv Case Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvCaseObservation(WnvPhcrClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static final String GET_WNV_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(wnv::WnvCaseObservation))->asSequence()->any(true).oclAsType(wnv::WnvCaseObservation)";

	/**
   * The cached OCL query for the '{@link #getWnvCaseObservation(WnvPhcrClinicalInformationSection) <em>Get Wnv Case Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getWnvCaseObservation(WnvPhcrClinicalInformationSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_WNV_CASE_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(wnv::WnvCaseObservation))->asSequence()->any(true).oclAsType(wnv::WnvCaseObservation)
   * @param wnvPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  WnvCaseObservation getWnvCaseObservation(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection) {
    if (GET_WNV_CASE_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(WnvPackage.Literals.WNV_PHCR_CLINICAL_INFORMATION_SECTION, WnvPackage.Literals.WNV_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(70));
      try
      {
        GET_WNV_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_WNV_CASE_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_WNV_CASE_OBSERVATION__EOCL_QRY);
    return (WnvCaseObservation) query.evaluate(wnvPhcrClinicalInformationSection);
  }

	/**
   * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.45')";

	/**
   * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.45')
   * @param wnvPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(WnvPhcrClinicalInformationSection wnvPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(WnvPackage.Literals.WNV_PHCR_CLINICAL_INFORMATION_SECTION);
      try
      {
        VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(wnvPhcrClinicalInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             WnvValidator.DIAGNOSTIC_SOURCE,
             WnvValidator.WNV_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validatePhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(wnvPhcrClinicalInformationSection, context) }),
             new Object [] { wnvPhcrClinicalInformationSection }));
      }
      return false;
    }
    return true;
  }

} // WnvPhcrClinicalInformationSectionOperations