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

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPackage;

import org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.pertussis.util.PertussisValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection#validatePertussisClinicalInformationSectionPertussisCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Clinical Information Section Pertussis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection#getPertussisCaseObservation() <em>Get Pertussis Case Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.pertussis.PertussisClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PertussisClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PertussisClinicalInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Clinical Information Section Pertussis Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pertussis::PertussisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pertussis Clinical Information Section Pertussis Case Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(pertussis::PertussisCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param pertussisClinicalInformationSection The receiving '<em><b>Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePertussisClinicalInformationSectionPertussisCaseObservation(PertussisClinicalInformationSection pertussisClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CLINICAL_INFORMATION_SECTION__PERTUSSIS_CLINICAL_INFORMATION_SECTION_PERTUSSIS_CASE_OBSERVATION,
						 PertussisPlugin.INSTANCE.getString("PertussisClinicalInformationSectionPertussisCaseObservation"),
						 new Object [] { pertussisClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPertussisCaseObservation(PertussisClinicalInformationSection) <em>Get Pertussis Case Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisCaseObservation(PertussisClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERTUSSIS_CASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisCaseObservation))->asSequence()->first().oclAsType(pertussis::PertussisCaseObservation)";

	/**
	 * The cached OCL query for the '{@link #getPertussisCaseObservation(PertussisClinicalInformationSection) <em>Get Pertussis Case Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPertussisCaseObservation(PertussisClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERTUSSIS_CASE_OBSERVATION__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(pertussis::PertussisCaseObservation))->asSequence()->first().oclAsType(pertussis::PertussisCaseObservation)
	 * @param pertussisClinicalInformationSection The receiving '<em><b>Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  PertussisCaseObservation getPertussisCaseObservation(PertussisClinicalInformationSection pertussisClinicalInformationSection) {
		if (GET_PERTUSSIS_CASE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(PertussisPackage.Literals.PERTUSSIS_CLINICAL_INFORMATION_SECTION, PertussisPackage.Literals.PERTUSSIS_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(69));
			try {
				GET_PERTUSSIS_CASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_PERTUSSIS_CASE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERTUSSIS_CASE_OBSERVATION__EOCL_QRY);
		return (PertussisCaseObservation) query.evaluate(pertussisClinicalInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.25')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.25')
	 * @param pertussisClinicalInformationSection The receiving '<em><b>Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(PertussisClinicalInformationSection pertussisClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(PertussisPackage.Literals.PERTUSSIS_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(pertussisClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 PertussisValidator.DIAGNOSTIC_SOURCE,
						 PertussisValidator.PERTUSSIS_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(pertussisClinicalInformationSection, context) }),
						 new Object [] { pertussisClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // PertussisClinicalInformationSectionOperations