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

import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionAliveObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PatientConditionDeceasedObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBRiskAssociatedProcedure;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPackage;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.HepbPlugin;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.STDHistoryObservation;
import org.openhealthtools.mdht.uml.cda.phcr.hepb.ViralHepatitisHistoryObservation;

import org.openhealthtools.mdht.uml.cda.phcr.hepb.util.HepbValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.PhcrClinicalInformationSectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BCase Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BRisk Associated Procedure</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Viral Hepatitis History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section STD History Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getAcuteHepatitisBCaseObservation() <em>Get Acute Hepatitis BCase Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getAcuteHepatitisBRiskAssociatedProcedures() <em>Get Acute Hepatitis BRisk Associated Procedures</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getViralHepatitisHistoryObservations() <em>Get Viral Hepatitis History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#getSTDHistoryObservations() <em>Get STD History Observations</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.hepb.AcuteHepatitisBPHCRClinicalInformationSection#validatePhcrClinicalInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AcuteHepatitisBPHCRClinicalInformationSectionOperations extends PhcrClinicalInformationSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcuteHepatitisBPHCRClinicalInformationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BCase Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BCase Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::AcuteHepatitisBCaseObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BCASE_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBCaseObservation"),
						 new Object [] { acuteHepatitisBPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BRisk Associated Procedure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hepb::AcuteHepatitisBRiskAssociatedProcedure) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Acute Hepatitis BRisk Associated Procedure</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.procedure.oclIsUndefined() and entry.procedure.oclIsKindOf(hepb::AcuteHepatitisBRiskAssociatedProcedure) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURE,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRClinicalInformationSectionAcuteHepatitisBRiskAssociatedProcedure"),
						 new Object [] { acuteHepatitisBPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Viral Hepatitis History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::ViralHepatitisHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section Viral Hepatitis History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::ViralHepatitisHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_VIRAL_HEPATITIS_HISTORY_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRClinicalInformationSectionViralHepatitisHistoryObservation"),
						 new Object [] { acuteHepatitisBPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section STD History Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::STDHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)";

	/**
	 * The cached OCL invariant for the '{@link #validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Acute Hepatitis BPHCR Clinical Information Section STD History Observation</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(hepb::STDHistoryObservation) and entry.typeCode = vocab::x_ActRelationshipEntry::DRIV)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateAcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION_STD_HISTORY_OBSERVATION,
						 HepbPlugin.INSTANCE.getString("AcuteHepatitisBPHCRClinicalInformationSectionSTDHistoryObservation"),
						 new Object [] { acuteHepatitisBPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Acute Hepatitis BCase Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBCaseObservation))->asSequence()->first().oclAsType(hepb::AcuteHepatitisBCaseObservation)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Acute Hepatitis BCase Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::AcuteHepatitisBCaseObservation))->asSequence()->first().oclAsType(hepb::AcuteHepatitisBCaseObservation)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  AcuteHepatitisBCaseObservation getAcuteHepatitisBCaseObservation(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection) {
		if (GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(72));
			try {
				GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BCASE_OBSERVATION__EOCL_QRY);
		return (AcuteHepatitisBCaseObservation) query.evaluate(acuteHepatitisBPHCRClinicalInformationSection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAcuteHepatitisBRiskAssociatedProcedures(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Acute Hepatitis BRisk Associated Procedures</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBRiskAssociatedProcedures(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_EXP = "self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hepb::AcuteHepatitisBRiskAssociatedProcedure)).oclAsType(hepb::AcuteHepatitisBRiskAssociatedProcedure)";

	/**
	 * The cached OCL query for the '{@link #getAcuteHepatitisBRiskAssociatedProcedures(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Acute Hepatitis BRisk Associated Procedures</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAcuteHepatitisBRiskAssociatedProcedures(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getProcedures()->select(procedure : cda::Procedure | not procedure.oclIsUndefined() and procedure.oclIsKindOf(hepb::AcuteHepatitisBRiskAssociatedProcedure)).oclAsType(hepb::AcuteHepatitisBRiskAssociatedProcedure)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<AcuteHepatitisBRiskAssociatedProcedure> getAcuteHepatitisBRiskAssociatedProcedures(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection) {
		if (GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(73));
			try {
				GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_QRY = helper.createQuery(GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACUTE_HEPATITIS_BRISK_ASSOCIATED_PROCEDURES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AcuteHepatitisBRiskAssociatedProcedure> result = (Collection<AcuteHepatitisBRiskAssociatedProcedure>) query.evaluate(acuteHepatitisBPHCRClinicalInformationSection);
		return new BasicEList.UnmodifiableEList<AcuteHepatitisBRiskAssociatedProcedure>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getViralHepatitisHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Viral Hepatitis History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViralHepatitisHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::ViralHepatitisHistoryObservation)).oclAsType(hepb::ViralHepatitisHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getViralHepatitisHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get Viral Hepatitis History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViralHepatitisHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::ViralHepatitisHistoryObservation)).oclAsType(hepb::ViralHepatitisHistoryObservation)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<ViralHepatitisHistoryObservation> getViralHepatitisHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection) {
		if (GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(74));
			try {
				GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VIRAL_HEPATITIS_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<ViralHepatitisHistoryObservation> result = (Collection<ViralHepatitisHistoryObservation>) query.evaluate(acuteHepatitisBPHCRClinicalInformationSection);
		return new BasicEList.UnmodifiableEList<ViralHepatitisHistoryObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSTDHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get STD History Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTDHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STD_HISTORY_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::STDHistoryObservation)).oclAsType(hepb::STDHistoryObservation)";

	/**
	 * The cached OCL query for the '{@link #getSTDHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection) <em>Get STD History Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSTDHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STD_HISTORY_OBSERVATIONS__EOCL_QRY;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(hepb::STDHistoryObservation)).oclAsType(hepb::STDHistoryObservation)
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<STDHistoryObservation> getSTDHistoryObservations(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection) {
		if (GET_STD_HISTORY_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION, HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION.getEAllOperations().get(75));
			try {
				GET_STD_HISTORY_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_STD_HISTORY_OBSERVATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STD_HISTORY_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<STDHistoryObservation> result = (Collection<STDHistoryObservation>) query.evaluate(acuteHepatitisBPHCRClinicalInformationSection);
		return new BasicEList.UnmodifiableEList<STDHistoryObservation>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.12')";

	/**
	 * The cached OCL invariant for the '{@link #validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Phcr Clinical Information Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.2.12')
	 * @param acuteHepatitisBPHCRClinicalInformationSection The receiving '<em><b>Acute Hepatitis BPHCR Clinical Information Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validatePhcrClinicalInformationSectionTemplateId(AcuteHepatitisBPHCRClinicalInformationSection acuteHepatitisBPHCRClinicalInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(HepbPackage.Literals.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION);
			try {
				VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(acuteHepatitisBPHCRClinicalInformationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 HepbValidator.DIAGNOSTIC_SOURCE,
						 HepbValidator.ACUTE_HEPATITIS_BPHCR_CLINICAL_INFORMATION_SECTION__PHCR_CLINICAL_INFORMATION_SECTION_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PhcrClinicalInformationSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(acuteHepatitisBPHCRClinicalInformationSection, context) }),
						 new Object [] { acuteHepatitisBPHCRClinicalInformationSection }));
			}
			 
			return false;
		}
		return true;
	}

} // AcuteHepatitisBPHCRClinicalInformationSectionOperations