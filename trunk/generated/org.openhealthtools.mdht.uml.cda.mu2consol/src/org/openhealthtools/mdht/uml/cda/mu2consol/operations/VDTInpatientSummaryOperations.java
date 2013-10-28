/*******************************************************************************
 * Copyright (c) 2012 Rama Ramakrishnan and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Rama Ramakrishnan (Agilex Corporation) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.mu2consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeInstructionsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>VDT Inpatient Summary</b></em>' model objects. <!--
 * end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryAdmissionDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryDischargeDate(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Discharge Date</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryAdmissionDischargeLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Discharge Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryMedications(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryReasonforHospitalization(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Reasonfor Hospitalization</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#validateVDTInpatientSummaryHospitalDischargeInstructionsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.VDTInpatientSummary#getHospitalDischargeInstructionsSection() <em>Get Hospital Discharge Instructions Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VDTInpatientSummaryOperations extends
		ViewDownloadTransmitSummaryOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected VDTInpatientSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryAdmissionDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryAdmissionDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent->notEmpty() and self.documentationOf.serviceEvent->forAll((effectiveTime.low.oclIsUndefined() or effectiveTime.low.isNullFlavorUndefined()) implies not effectiveTime.low.oclIsUndefined())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll((effectiveTime.low.oclIsUndefined() or effectiveTime.low.isNullFlavorUndefined()) implies not effectiveTime.low.oclIsUndefined())) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryAdmissionDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryAdmissionDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vdtInpatientSummary The receiving '<em><b>VDT Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVDTInpatientSummaryAdmissionDate(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_ADMISSION_DATE,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryAdmissionDate"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryDischargeDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Discharge Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryDischargeDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.documentationOf.oclAsType(cda::DocumentationOf).serviceEvent->notEmpty() and self.documentationOf.serviceEvent->forAll((effectiveTime.high.oclIsUndefined() or effectiveTime.high.isNullFlavorUndefined()) implies not effectiveTime.high.oclIsUndefined())) or (self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll((effectiveTime.high.oclIsUndefined() or effectiveTime.high.isNullFlavorUndefined()) implies not effectiveTime.oclIsUndefined() and not effectiveTime.high.oclIsUndefined())) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryDischargeDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Discharge Date</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryDischargeDate(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vdtInpatientSummary The receiving '<em><b>VDT Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVDTInpatientSummaryDischargeDate(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_DISCHARGE_DATE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_DISCHARGE_DATE,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryDischargeDate"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryAdmissionDischargeLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Discharge Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryAdmissionDischargeLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.componentOf.oclAsType(cda::Component1).encompassingEncounter->notEmpty() and self.componentOf.encompassingEncounter->forAll(location->notEmpty() and location.oclIsTypeOf(cda::Location))) or (self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryAdmissionDischargeLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Admission Discharge Location</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryAdmissionDischargeLocation(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vdtInpatientSummary The receiving '<em><b>VDT Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVDTInpatientSummaryAdmissionDischargeLocation(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_ADMISSION_DISCHARGE_LOCATION,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryAdmissionDischargeLocation"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryMedications(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryMedications(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::MedicationsSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalDischargeMedicationsSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryMedications(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Medications</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryMedications(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vdtInpatientSummary The receiving '<em><b>VDT Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVDTInpatientSummaryMedications(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_MEDICATIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_MEDICATIONS,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryMedications"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryReasonforHospitalization(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Reasonfor Hospitalization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryReasonforHospitalization(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "((self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintSection)) or "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ReasonForVisitSection))) xor "+
" self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ChiefComplaintAndReasonForVisitSection))) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::EncountersSectionEntriesOptional)) or self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::HospitalAdmissionDiagnosisSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PreoperativeDiagnosisSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryReasonforHospitalization(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Reasonfor Hospitalization</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryReasonforHospitalization(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vdtInpatientSummary The receiving '<em><b>VDT Inpatient Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateVDTInpatientSummaryReasonforHospitalization(VDTInpatientSummary vdtInpatientSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_REASONFOR_HOSPITALIZATION,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryReasonforHospitalization"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate VDT Inpatient Summary Hospital Discharge Instructions Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateVDTInpatientSummaryHospitalDischargeInstructionsSection(VDTInpatientSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateVDTInpatientSummaryHospitalDischargeInstructionsSection(
			VDTInpatientSummary vdtInpatientSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY);
			try {
				VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(vdtInpatientSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VDT_INPATIENT_SUMMARY__VDT_INPATIENT_SUMMARY_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("VDTInpatientSummaryVDTInpatientSummaryHospitalDischargeInstructionsSection"),
						 new Object [] { vdtInpatientSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * <em>Get Hospital Discharge Instructions Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::HospitalDischargeInstructionsSection))->asSequence()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeInstructionsSection(VDTInpatientSummary) <em>Get Hospital Discharge Instructions Section</em>}' query operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getHospitalDischargeInstructionsSection(VDTInpatientSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::HospitalDischargeInstructionsSection
	 * ))->asSequence
	 * ()->any(true).oclAsType(consol::HospitalDischargeInstructionsSection)
	 * 
	 * @param vdtInpatientSummary
	 *            The receiving '<em><b>VDT Inpatient Summary</b></em>' model
	 *            object. <!-- end-model-doc -->
	 * @generated
	 */

	public static HospitalDischargeInstructionsSection getHospitalDischargeInstructionsSection(
			VDTInpatientSummary vdtInpatientSummary) {
		if (GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY, Mu2consolPackage.Literals.VDT_INPATIENT_SUMMARY.getEAllOperations().get(315));
			try {
				GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_INSTRUCTIONS_SECTION__EOCL_QRY);
		return (HospitalDischargeInstructionsSection) query.evaluate(vdtInpatientSummary);
	}

} // VDTInpatientSummaryOperations