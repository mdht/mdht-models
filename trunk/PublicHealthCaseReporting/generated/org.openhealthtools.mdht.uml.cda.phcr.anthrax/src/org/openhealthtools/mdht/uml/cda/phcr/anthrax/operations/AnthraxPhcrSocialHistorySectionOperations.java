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
package org.openhealthtools.mdht.uml.cda.phcr.anthrax.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPackage;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPossibleExpossureLocationAndTypeAct;
import org.openhealthtools.mdht.uml.cda.phcr.anthrax.util.AnthraxValidator;
import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrSocialHistorySectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Social History Section Anthrax Possible Expossure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#getAnthraxPossibleExpossureLocationAndTypeActs() <em>Get Anthrax Possible Expossure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.anthrax.AnthraxPhcrSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AnthraxPhcrSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected AnthraxPhcrSocialHistorySectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Social History Section Anthrax Possible Expossure Location And Type Act</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(anthrax::AnthraxPossibleExpossureLocationAndTypeAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
   * The cached OCL invariant for the '{@link #validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Anthrax Phcr Social History Section Anthrax Possible Expossure Location And Type Act</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param anthraxPhcrSocialHistorySection The receiving '<em><b>Phcr Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateAnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPhcrSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACT,
             AnthraxPlugin.INSTANCE.getString("AnthraxPhcrSocialHistorySectionAnthraxPossibleExpossureLocationAndTypeAct"),
             new Object [] { anthraxPhcrSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getAnthraxPossibleExpossureLocationAndTypeActs(AnthraxPhcrSocialHistorySection) <em>Get Anthrax Possible Expossure Location And Type Acts</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxPossibleExpossureLocationAndTypeActs(AnthraxPhcrSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static final String GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(anthrax::AnthraxPossibleExpossureLocationAndTypeAct)).oclAsType(anthrax::AnthraxPossibleExpossureLocationAndTypeAct)";

	/**
   * The cached OCL query for the '{@link #getAnthraxPossibleExpossureLocationAndTypeActs(AnthraxPhcrSocialHistorySection) <em>Get Anthrax Possible Expossure Location And Type Acts</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAnthraxPossibleExpossureLocationAndTypeActs(AnthraxPhcrSocialHistorySection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	
	public static  EList<AnthraxPossibleExpossureLocationAndTypeAct> getAnthraxPossibleExpossureLocationAndTypeActs(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection) {
    if (GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(AnthraxPackage.Literals.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION, AnthraxPackage.Literals.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION.getEAllOperations().get(82));
      try
      {
        GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ANTHRAX_POSSIBLE_EXPOSSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<AnthraxPossibleExpossureLocationAndTypeAct> result = (Collection<AnthraxPossibleExpossureLocationAndTypeAct>) query.evaluate(anthraxPhcrSocialHistorySection);
    return new BasicEList.UnmodifiableEList<AnthraxPossibleExpossureLocationAndTypeAct>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.17')";

	/**
   * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param anthraxPhcrSocialHistorySection The receiving '<em><b>Phcr Social History Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateSocialHistorySectionTemplateId(AnthraxPhcrSocialHistorySection anthraxPhcrSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(AnthraxPackage.Literals.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION);
      try
      {
        VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(anthraxPhcrSocialHistorySection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             AnthraxValidator.DIAGNOSTIC_SOURCE,
             AnthraxValidator.ANTHRAX_PHCR_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(anthraxPhcrSocialHistorySection, context) }),
             new Object [] { anthraxPhcrSocialHistorySection }));
      }
       
      return false;
    }
    return true;
  }

} // AnthraxPhcrSocialHistorySectionOperations