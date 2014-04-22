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
import org.openhealthtools.mdht.uml.cda.consol.AllergiesSection;
import org.openhealthtools.mdht.uml.cda.consol.PreoperativeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.consol.ProblemSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPackage;
import org.openhealthtools.mdht.uml.cda.mu2consol.Mu2consolPlugin;
import org.openhealthtools.mdht.uml.cda.mu2consol.ProceduresSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ResultsSection;
import org.openhealthtools.mdht.uml.cda.mu2consol.SocialHistorySection;
import org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary;
import org.openhealthtools.mdht.uml.cda.mu2consol.util.Mu2consolValidator;

/**
 * <!-- begin-user-doc --> A static utility class that provides operations
 * related to '<em><b>View Download Transmit Summary</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryCarePlanning(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Planning</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryVitalSigns(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProblemSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryProceduresSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummaryResultsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#validateViewDownloadTransmitSummarySocialHistorySection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#retrievePreoperativeDiagnosisSection() <em>Retrieve Preoperative Diagnosis Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProblemSection() <em>Get Problem Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getProceduresSection() <em>Get Procedures Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getResultsSection() <em>Get Results Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mu2consol.ViewDownloadTransmitSummary#getSocialHistorySection() <em>Get Social History Section</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ViewDownloadTransmitSummaryOperations extends
		GeneralHeaderConstraintsOperations {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewDownloadTransmitSummaryOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryCarePlanning(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Planning</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryCarePlanning(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::PlanOfCareSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::AssessmentAndPlanSection)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryCarePlanning(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Care Planning</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryCarePlanning(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param viewDownloadTransmitSummary The receiving '<em><b>View Download Transmit Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateViewDownloadTransmitSummaryCarePlanning(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_CARE_PLANNING,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryCarePlanning"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryVitalSigns(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryVitalSigns(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSection)) or "+
"self.getAllSections()->one(s : cda::Section | not s.oclIsUndefined() and s.oclIsTypeOf(consol::VitalSignsSectionEntriesOptional)))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryVitalSigns(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Vital Signs</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryVitalSigns(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param viewDownloadTransmitSummary The receiving '<em><b>View Download Transmit Summary</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateViewDownloadTransmitSummaryVitalSigns(ViewDownloadTransmitSummary viewDownloadTransmitSummary, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_VITAL_SIGNS,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryVitalSigns"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Allergies Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryAllergiesSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryAllergiesSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_ALLERGIES_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryAllergiesSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Problem Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProblemSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryProblemSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROBLEM_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryProblemSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Procedures Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryProceduresSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ProceduresSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryProceduresSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_PROCEDURES_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryProceduresSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Results Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummaryResultsSection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ResultsSection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummaryResultsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_RESULTS_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummaryResultsSection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}' operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))";

	/**
	 * The cached OCL invariant for the '{@link #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate View Download Transmit Summary Social History Section</em>}' invariant operation.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #validateViewDownloadTransmitSummarySocialHistorySection(ViewDownloadTransmitSummary, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->one(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection))
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object.
	 * @param diagnostics
	 *            The chain of diagnostics to which problems are to be appended.
	 * @param context
	 *            The cache of context-specific information. <!-- end-model-doc
	 *            -->
	 * @generated
	 */

	public static boolean validateViewDownloadTransmitSummarySocialHistorySection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY);
			try {
				VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(viewDownloadTransmitSummary)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 Mu2consolValidator.DIAGNOSTIC_SOURCE,
						 Mu2consolValidator.VIEW_DOWNLOAD_TRANSMIT_SUMMARY__VIEW_DOWNLOAD_TRANSMIT_SUMMARY_SOCIAL_HISTORY_SECTION,
						 Mu2consolPlugin.INSTANCE.getString("ViewDownloadTransmitSummarySocialHistorySection"),
						 new Object [] { viewDownloadTransmitSummary }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '
	 * {@link #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * <em>Retrieve Preoperative Diagnosis Section</em>}' operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::PreoperativeDiagnosisSection))->asSequence()->any(true).oclAsType(consol::PreoperativeDiagnosisSection)";

	/**
	 * The cached OCL query for the '
	 * {@link #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * <em>Retrieve Preoperative Diagnosis Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #retrievePreoperativeDiagnosisSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::PreoperativeDiagnosisSection
	 * ))->asSequence()->
	 * any(true).oclAsType(consol::PreoperativeDiagnosisSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static PreoperativeDiagnosisSection retrievePreoperativeDiagnosisSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(303));
			try {
				RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY = helper.createQuery(RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(RETRIEVE_PREOPERATIVE_DIAGNOSIS_SECTION__EOCL_QRY);
		return (PreoperativeDiagnosisSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergiesSection(ViewDownloadTransmitSummary) <em>Get Allergies Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAllergiesSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSection))->asSequence()->any(true).oclAsType(consol::AllergiesSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergiesSection(ViewDownloadTransmitSummary) <em>Get Allergies Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergiesSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::AllergiesSection)
	 * )->asSequence()->any(true).oclAsType(consol::AllergiesSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static AllergiesSection getAllergiesSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_ALLERGIES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(304));
			try {
				GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
		return (AllergiesSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProblemSection(ViewDownloadTransmitSummary) <em>Get Problem Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProblemSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROBLEM_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::ProblemSection))->asSequence()->any(true).oclAsType(consol::ProblemSection)";

	/**
	 * The cached OCL query for the '{@link #getProblemSection(ViewDownloadTransmitSummary) <em>Get Problem Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProblemSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROBLEM_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(consol::ProblemSection))-
	 * >asSequence()->any(true).oclAsType(consol::ProblemSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProblemSection getProblemSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_PROBLEM_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(305));
			try {
				GET_PROBLEM_SECTION__EOCL_QRY = helper.createQuery(GET_PROBLEM_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROBLEM_SECTION__EOCL_QRY);
		return (ProblemSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getProceduresSection(ViewDownloadTransmitSummary) <em>Get Procedures Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProceduresSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PROCEDURES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ProceduresSection))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)";

	/**
	 * The cached OCL query for the '{@link #getProceduresSection(ViewDownloadTransmitSummary) <em>Get Procedures Section</em>}' query operation.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getProceduresSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PROCEDURES_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ProceduresSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::ProceduresSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ProceduresSection getProceduresSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_PROCEDURES_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(306));
			try {
				GET_PROCEDURES_SECTION__EOCL_QRY = helper.createQuery(GET_PROCEDURES_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PROCEDURES_SECTION__EOCL_QRY);
		return (ProceduresSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getResultsSection(ViewDownloadTransmitSummary) <em>Get Results Section</em>}' operation.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getResultsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RESULTS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::ResultsSection))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)";

	/**
	 * The cached OCL query for the '{@link #getResultsSection(ViewDownloadTransmitSummary) <em>Get Results Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultsSection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RESULTS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::ResultsSection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::ResultsSection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static ResultsSection getResultsSection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_RESULTS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(307));
			try {
				GET_RESULTS_SECTION__EOCL_QRY = helper.createQuery(GET_RESULTS_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RESULTS_SECTION__EOCL_QRY);
		return (ResultsSection) query.evaluate(viewDownloadTransmitSummary);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistorySection(ViewDownloadTransmitSummary) <em>Get Social History Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistorySection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mu2consol::SocialHistorySection))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)";

	/**
	 * The cached OCL query for the '
	 * {@link #getSocialHistorySection(ViewDownloadTransmitSummary)
	 * <em>Get Social History Section</em>}' query operation. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSocialHistorySection(ViewDownloadTransmitSummary)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc --> <!-- begin-model-doc -->
	 * self.getAllSections()->select(section : cda::Section | not
	 * section.oclIsUndefined() and
	 * section.oclIsKindOf(mu2consol::SocialHistorySection
	 * ))->asSequence()->any(true).oclAsType(mu2consol::SocialHistorySection)
	 * 
	 * @param viewDownloadTransmitSummary
	 *            The receiving '<em><b>View Download Transmit Summary</b></em>'
	 *            model object. <!-- end-model-doc -->
	 * @generated
	 */

	public static SocialHistorySection getSocialHistorySection(
			ViewDownloadTransmitSummary viewDownloadTransmitSummary) {
		if (GET_SOCIAL_HISTORY_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY, Mu2consolPackage.Literals.VIEW_DOWNLOAD_TRANSMIT_SUMMARY.getEAllOperations().get(308));
			try {
				GET_SOCIAL_HISTORY_SECTION__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY_SECTION__EOCL_QRY);
		return (SocialHistorySection) query.evaluate(viewDownloadTransmitSummary);
	}

} // ViewDownloadTransmitSummaryOperations