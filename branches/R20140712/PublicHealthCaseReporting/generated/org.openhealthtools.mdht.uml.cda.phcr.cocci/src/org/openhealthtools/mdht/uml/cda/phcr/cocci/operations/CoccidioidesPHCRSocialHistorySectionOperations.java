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
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPossibleExposureLocationAct;

import org.openhealthtools.mdht.uml.cda.phcr.cocci.util.CocciValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Coccidioides PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Social History Section Coccidioides Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#getCoccidioidesPossibleExposureLocationActs() <em>Get Coccidioides Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.cocci.CoccidioidesPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoccidioidesPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CoccidioidesPHCRSocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Social History Section Coccidioides Possible Exposure Location Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(cocci::CoccidioidesPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Coccidioides PHCR Social History Section Coccidioides Possible Exposure Location Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(cocci::CoccidioidesPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
   * @param coccidioidesPHCRSocialHistorySection The receiving '<em><b>Coccidioides PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateCoccidioidesPHCRSocialHistorySectionCoccidioidesPossibleExposureLocationAct", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRSocialHistorySection, context) }),
             new Object [] { coccidioidesPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCoccidioidesPossibleExposureLocationActs(CoccidioidesPHCRSocialHistorySection) <em>Get Coccidioides Possible Exposure Location Acts</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPossibleExposureLocationActs(CoccidioidesPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cocci::CoccidioidesPossibleExposureLocationAct)).oclAsType(cocci::CoccidioidesPossibleExposureLocationAct)";

	/**
   * The cached OCL query for the '{@link #getCoccidioidesPossibleExposureLocationActs(CoccidioidesPHCRSocialHistorySection) <em>Get Coccidioides Possible Exposure Location Acts</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCoccidioidesPossibleExposureLocationActs(CoccidioidesPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cocci::CoccidioidesPossibleExposureLocationAct)).oclAsType(cocci::CoccidioidesPossibleExposureLocationAct)
   * @param coccidioidesPHCRSocialHistorySection The receiving '<em><b>Coccidioides PHCR Social History Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<CoccidioidesPossibleExposureLocationAct> getCoccidioidesPossibleExposureLocationActs(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection) {
    if (GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION, CocciPackage.Literals.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(76));
      try
      {
        GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY = helper.createQuery(GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_COCCIDIOIDES_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CoccidioidesPossibleExposureLocationAct> result = (Collection<CoccidioidesPossibleExposureLocationAct>) query.evaluate(coccidioidesPHCRSocialHistorySection);
    return new BasicEList.UnmodifiableEList<CoccidioidesPossibleExposureLocationAct>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.29')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.29')
   * @param coccidioidesPHCRSocialHistorySection The receiving '<em><b>Coccidioides PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSocialHistorySectionTemplateId(CoccidioidesPHCRSocialHistorySection coccidioidesPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(CocciPackage.Literals.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(coccidioidesPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             CocciValidator.DIAGNOSTIC_SOURCE,
             CocciValidator.COCCIDIOIDES_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateSocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(coccidioidesPHCRSocialHistorySection, context) }),
             new Object [] { coccidioidesPHCRSocialHistorySection }));
      }
      return false;
    }
    return true;
  }

} // CoccidioidesPHCRSocialHistorySectionOperations