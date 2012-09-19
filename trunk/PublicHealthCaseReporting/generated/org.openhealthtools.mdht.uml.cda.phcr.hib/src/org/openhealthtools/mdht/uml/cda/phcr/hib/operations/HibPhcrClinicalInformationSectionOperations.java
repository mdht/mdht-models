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
package org.openhealthtools.mdht.uml.cda.phcr.hib.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.phcr.hib.HibCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection;

import org.openhealthtools.mdht.uml.cda.phcr.hib.util.HibValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Phcr Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection#validateHibPhcrClinicalInformationSectionHibCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Clinical Information Section Hib Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection#getHibCaseObservation() <em>Get Hib Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hib.HibPhcrClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HibPhcrClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HibPhcrClinicalInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Clinical Information Section Hib Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hib::HibCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hib Phcr Clinical Information Section Hib Case Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hib::HibCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param hibPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateHibPhcrClinicalInformationSectionHibCaseObservation(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibPhcrClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_PHCR_CLINICAL_INFORMATION_SECTION__HIB_PHCR_CLINICAL_INFORMATION_SECTION_HIB_CASE_OBSERVATION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HibPhcrClinicalInformationSectionHibCaseObservation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibPhcrClinicalInformationSection, context) }),
						 new Object [] { hibPhcrClinicalInformationSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHibCaseObservation(HibPhcrClinicalInformationSection) <em>Get Hib Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibCaseObservation(HibPhcrClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HIB_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibCaseObservation))->asSequence()->first().oclAsType(hib::HibCaseObservation)";

	/**
	 * The cached OCL query for the '{@link #getHibCaseObservation(HibPhcrClinicalInformationSection) <em>Get Hib Case Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHibCaseObservation(HibPhcrClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HIB_CASE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hib::HibCaseObservation))->asSequence()->first().oclAsType(hib::HibCaseObservation)
	 * @param hibPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  HibCaseObservation getHibCaseObservation(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection) {
		if (GET_HIB_CASE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HibPackage.Literals.HIB_PHCR_CLINICAL_INFORMATION_SECTION, HibPackage.Literals.HIB_PHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(70));
			try {
				GET_HIB_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_HIB_CASE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HIB_CASE_OBSERVATION__EOCL_QRY);
		return (HibCaseObservation) query.evaluate(hibPhcrClinicalInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.57')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.57')
	 * @param hibPhcrClinicalInformationSection The receiving '<em><b>Phcr Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(HibPhcrClinicalInformationSection hibPhcrClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HibPackage.Literals.HIB_PHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(hibPhcrClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HibValidator.DIAGNOSTIC_SOURCE,
						 HibValidator.HIB_PHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(hibPhcrClinicalInformationSection, context) }),
						 new Object [] { hibPhcrClinicalInformationSection }));
			}
			return false;
		}
		return true;
	}

} // HibPhcrClinicalInformationSectionOperations