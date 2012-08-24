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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.tularemia.util.TularemiaValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Tularemia PHCR Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Social History Section Tularemia Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#getTularemiaPossibleExposureLocationAndTypeActs() <em>Get Tularemia Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TularemiaPHCRSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected TularemiaPHCRSocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Social History Section Tularemia Possible Exposure Location And Type Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(tularemia::TularemiaPossibleExposureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Tularemia PHCR Social History Section Tularemia Possible Exposure Location And Type Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateTularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT,
             TularemiaPlugin.INSTANCE.getString("TularemiaPHCRSocialHistorySectionTularemiaPossibleExposureLocationAndTypeAct"),
             new Object [] { tularemiaPHCRSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getTularemiaPossibleExposureLocationAndTypeActs(TularemiaPHCRSocialHistorySection) <em>Get Tularemia Possible Exposure Location And Type Acts</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaPossibleExposureLocationAndTypeActs(TularemiaPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(tularemia::TularemiaPossibleExposureLocationAndTypeAct)).oclAsType(tularemia::TularemiaPossibleExposureLocationAndTypeAct)";

	/**
   * The cached OCL query for the '{@link #getTularemiaPossibleExposureLocationAndTypeActs(TularemiaPHCRSocialHistorySection) <em>Get Tularemia Possible Exposure Location And Type Acts</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getTularemiaPossibleExposureLocationAndTypeActs(TularemiaPHCRSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static  EList<TularemiaPossibleExposureLocationAndTypeAct> getTularemiaPossibleExposureLocationAndTypeActs(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection) {
    if (GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(TularemiaPackage.Literals.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION, TularemiaPackage.Literals.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(82));
      try
      {
        GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_TULAREMIA_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<TularemiaPossibleExposureLocationAndTypeAct> result = (Collection<TularemiaPossibleExposureLocationAndTypeAct>) query.evaluate(tularemiaPHCRSocialHistorySection);
    return new BasicEList.UnmodifiableEList<TularemiaPossibleExposureLocationAndTypeAct>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.18')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param tularemiaPHCRSocialHistorySection The receiving '<em><b>PHCR Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	public static  boolean validateSocialHistorySectionTemplateId(TularemiaPHCRSocialHistorySection tularemiaPHCRSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(TularemiaPackage.Literals.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(tularemiaPHCRSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             TularemiaValidator.DIAGNOSTIC_SOURCE,
             TularemiaValidator.TULAREMIA_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(tularemiaPHCRSocialHistorySection, context) }),
             new Object [] { tularemiaPHCRSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

} // TularemiaPHCRSocialHistorySectionOperations