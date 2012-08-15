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
package org.openhealthtools.mdht.uml.cda.phcr.pertussis.operations;

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
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleCaseContactLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPossibleExposureLocationAct;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Social History Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Exposure Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Case Contact Location Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#getPertussisPossibleExposureLocationActs() <em>Get Pertussis Possible Exposure Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#getPertussisPossibleCaseContactLocationActs() <em>Get Pertussis Possible Case Contact Location Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisSocialHistorySection#validateSocialHistorySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisSocialHistorySectionOperations extends PhcrSocialHistorySectionOperations
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PertussisSocialHistorySectionOperations() {
		super();
	}

  /**
	 * The cached OCL expression body for the '{@link #validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Exposure Location Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(pertussis::PertussisPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Exposure Location Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(pertussis::PertussisPossibleExposureLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param pertussisSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisSocialHistorySectionPertussisPossibleExposureLocationAct(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SOCIAL_HISTORY_SECTION__PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACT,
						 PertussisPlugin.INSTANCE.getString("PertussisSocialHistorySectionPertussisPossibleExposureLocationAct"),
						 new Object [] { pertussisSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Case Contact Location Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(pertussis::PertussisPossibleCaseContactLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

		/**
	 * The cached OCL invariant for the '{@link #validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Social History Section Pertussis Possible Case Contact Location Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(pertussis::PertussisPossibleCaseContactLocationAct) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param pertussisSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SOCIAL_HISTORY_SECTION__PERTUSSIS_SOCIAL_HISTORY_SECTION_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACT,
						 PertussisPlugin.INSTANCE.getString("PertussisSocialHistorySectionPertussisPossibleCaseContactLocationAct"),
						 new Object [] { pertussisSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisPossibleExposureLocationActs(PertussisSocialHistorySection) <em>Get Pertussis Possible Exposure Location Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisPossibleExposureLocationActs(PertussisSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(pertussis::PertussisPossibleExposureLocationAct)).oclAsType(pertussis::PertussisPossibleExposureLocationAct)";

		/**
	 * The cached OCL query for the '{@link #getPertussisPossibleExposureLocationActs(PertussisSocialHistorySection) <em>Get Pertussis Possible Exposure Location Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisPossibleExposureLocationActs(PertussisSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(pertussis::PertussisPossibleExposureLocationAct)).oclAsType(pertussis::PertussisPossibleExposureLocationAct)
	 * @param pertussisSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<PertussisPossibleExposureLocationAct> getPertussisPossibleExposureLocationActs(PertussisSocialHistorySection pertussisSocialHistorySection) {
		if (GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION, PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION.getEAllOperations().get(81));
			try {
				GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_POSSIBLE_EXPOSURE_LOCATION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PertussisPossibleExposureLocationAct> result = (Collection<PertussisPossibleExposureLocationAct>) query.evaluate(pertussisSocialHistorySection);
		return new BasicEList.UnmodifiableEList<PertussisPossibleExposureLocationAct>(result.size(), result.toArray());
	}

		/**
	 * The cached OCL expression body for the '{@link #getPertussisPossibleCaseContactLocationActs(PertussisSocialHistorySection) <em>Get Pertussis Possible Case Contact Location Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisPossibleCaseContactLocationActs(PertussisSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(pertussis::PertussisPossibleCaseContactLocationAct)).oclAsType(pertussis::PertussisPossibleCaseContactLocationAct)";

		/**
	 * The cached OCL query for the '{@link #getPertussisPossibleCaseContactLocationActs(PertussisSocialHistorySection) <em>Get Pertussis Possible Case Contact Location Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisPossibleCaseContactLocationActs(PertussisSocialHistorySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_QRY;


		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(pertussis::PertussisPossibleCaseContactLocationAct)).oclAsType(pertussis::PertussisPossibleCaseContactLocationAct)
	 * @param pertussisSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<PertussisPossibleCaseContactLocationAct> getPertussisPossibleCaseContactLocationActs(PertussisSocialHistorySection pertussisSocialHistorySection) {
		if (GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION, PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION.getEAllOperations().get(82));
			try {
				GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_POSSIBLE_CASE_CONTACT_LOCATION_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<PertussisPossibleCaseContactLocationAct> result = (Collection<PertussisPossibleCaseContactLocationAct>) query.evaluate(pertussisSocialHistorySection);
		return new BasicEList.UnmodifiableEList<PertussisPossibleCaseContactLocationAct>(result.size(), result.toArray());
	}

		/**
	 * The cached OCL expression body for the '{@link #validateSocialHistorySectionTemplateId(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  protected static final String VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.24')";

  /**
	 * The cached OCL invariant for the '{@link #validateSocialHistorySectionTemplateId(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Social History Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #validateSocialHistorySectionTemplateId(PertussisSocialHistorySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
  
  protected static Constraint VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.24')
	 * @param pertussisSocialHistorySection The receiving '<em><b>Social History Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
  
  public static  boolean validateSocialHistorySectionTemplateId(PertussisSocialHistorySection pertussisSocialHistorySection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
		if (VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_SOCIAL_HISTORY_SECTION);
			try {
				VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_SOCIAL_HISTORY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisSocialHistorySection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_SOCIAL_HISTORY_SECTION__SOCIAL_HISTORY_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SocialHistorySectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisSocialHistorySection, context) }),
						 new Object [] { pertussisSocialHistorySection }));
			}
			 
			return false;
		}
		return true;
	}

} // PertussisSocialHistorySectionOperations