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
package org.openhealthtools.mdht.uml.cda.phcr.streppneumo.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPackage;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection;

import org.openhealthtools.mdht.uml.cda.phcr.streppneumo.util.StrepPneumoValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Social History Section Strep Pneumo Possible Exposure Location And Type Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#getStrepPneumoPossibleExposureLocationAndTypeActs() <em>Get Strep Pneumo Possible Exposure Location And Type Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.streppneumo.StrepPneumoSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StrepPneumoSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StrepPneumoSocialHistorySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Social History Section Strep Pneumo Possible Exposure Location And Type Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(streppneumo::StrepPneumoPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Strep Pneumo Social History Section Strep Pneumo Possible Exposure Location And Type Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(streppneumo::StrepPneumoPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param strepPneumoSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateStrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_SOCIAL_HISTORY_SECTION__STREP_PNEUMO_SOCIAL_HISTORY_SECTION_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACT,
						 StrepPneumoPlugin.INSTANCE.getString("StrepPneumoSocialHistorySectionStrepPneumoPossibleExposureLocationAndTypeAct"),
						 new Object [] { strepPneumoSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStrepPneumoPossibleExposureLocationAndTypeActs(StrepPneumoSocialHistorySection) <em>Get Strep Pneumo Possible Exposure Location And Type Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPossibleExposureLocationAndTypeActs(StrepPneumoSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(streppneumo::StrepPneumoPossibleExposureLocationAct)).oclAsType(streppneumo::StrepPneumoPossibleExposureLocationAct)";

	/**
	 * The cached OCL query for the '{@link #getStrepPneumoPossibleExposureLocationAndTypeActs(StrepPneumoSocialHistorySection) <em>Get Strep Pneumo Possible Exposure Location And Type Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrepPneumoPossibleExposureLocationAndTypeActs(StrepPneumoSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(streppneumo::StrepPneumoPossibleExposureLocationAct)).oclAsType(streppneumo::StrepPneumoPossibleExposureLocationAct)
	 * @param strepPneumoSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<StrepPneumoPossibleExposureLocationAct> getStrepPneumoPossibleExposureLocationAndTypeActs(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection) {
		if (GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(StrepPneumoPackage.Literals.STREP_PNEUMO_SOCIAL_HISTORY_SECTION, StrepPneumoPackage.Literals.STREP_PNEUMO_SOCIAL_HISTORY_SECTION.getEAllOperations().get(80));
			try {
				GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY = helper.createQuery(GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STREP_PNEUMO_POSSIBLE_EXPOSURE_LOCATION_AND_TYPE_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<StrepPneumoPossibleExposureLocationAct> result = (Collection<StrepPneumoPossibleExposureLocationAct>) query.evaluate(strepPneumoSocialHistorySection);
		return new BasicEList.UnmodifiableEList<StrepPneumoPossibleExposureLocationAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.54')";

	/**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.54')
	 * @param strepPneumoSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateSocialHistorySectionTemplateId(StrepPneumoSocialHistorySection strepPneumoSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(StrepPneumoPackage.Literals.STREP_PNEUMO_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(strepPneumoSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 StrepPneumoValidator.DIAGNOSTIC_SOURCE,
						 StrepPneumoValidator.STREP_PNEUMO_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(strepPneumoSocialHistorySection, context) }),
						 new Object [] { strepPneumoSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // StrepPneumoSocialHistorySectionOperations