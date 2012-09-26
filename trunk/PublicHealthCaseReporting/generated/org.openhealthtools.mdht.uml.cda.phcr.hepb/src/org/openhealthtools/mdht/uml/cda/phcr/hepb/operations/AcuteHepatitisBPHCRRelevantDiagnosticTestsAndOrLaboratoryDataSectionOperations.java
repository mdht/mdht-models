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
package org.openhealthtools.mdht.uml.cda.phcr.hepb.operations;

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

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBResultObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrRelevantDxTestsSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section Acute Hepatitis BResult Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#getAcuteHepatitisBResultObservations() <em>Get Acute Hepatitis BResult Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection#validateResultsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations extends PhcrRelevantDxTestsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section Acute Hepatitis BResult Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section Acute Hepatitis BResult Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBResultObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION_ACUTE_HEPATITIS_BRESULT_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionAcuteHepatitisBResultObservation"),
						 new Object [] { acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBResultObservations(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Acute Hepatitis BResult Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBResultObservations(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBResultObservation)).oclAsType(hepb::AcuteHepatitisBResultObservation)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBResultObservations(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) <em>Get Acute Hepatitis BResult Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBResultObservations(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBResultObservation)).oclAsType(hepb::AcuteHepatitisBResultObservation)
	 * @param acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBResultObservation> getAcuteHepatitisBResultObservations(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection) {
		if (GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION.getEAllOperations().get(71));
			try {
				GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BRESULT_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBResultObservation> result = (Collection<AcuteHepatitisBResultObservation>) query.evaluate(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBResultObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.13')";

	/**
	 * The cached OCL invariant for the '{@link #validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Results Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.13')
	 * @param acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection The receiving '<em><b>Acute Hepatitis BPHCR Relevant Diagnostic Tests And Or Laboratory Data Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateResultsSectionTemplateId(AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION);
			try {
				VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_RESULTS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_RELEVANT_DIAGNOSTIC_TESTS_AND_OR_LABORATORY_DATA_SECTION__RESULTS_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ResultsSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection, context) }),
						 new Object [] { acuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSection }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBPHCRRelevantDiagnosticTestsAndOrLaboratoryDataSectionOperations