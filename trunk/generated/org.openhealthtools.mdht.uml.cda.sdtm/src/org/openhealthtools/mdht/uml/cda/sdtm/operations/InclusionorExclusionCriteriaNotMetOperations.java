/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

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

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.Category;
import org.openhealthtools.mdht.uml.cda.sdtm.Comment;
import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.DomainAssignment;
import org.openhealthtools.mdht.uml.cda.sdtm.FindingAbout;
import org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet;
import org.openhealthtools.mdht.uml.cda.sdtm.RelatedRecord;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.SubCategory;
import org.openhealthtools.mdht.uml.cda.sdtm.SupplementalValue;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetDomainAssignment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetRelatedRecord(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Related Record</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetSupplementalValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Supplemental Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetSubCategory(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#validateInclusionorExclusionCriteriaNotMetFindingAbout(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Finding About</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getComments() <em>Get Comments</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getDomainAssignment() <em>Get Domain Assignment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getRelatedRecords() <em>Get Related Records</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getSupplementalValues() <em>Get Supplemental Values</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getCategory() <em>Get Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getSubCategory() <em>Get Sub Category</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.InclusionorExclusionCriteriaNotMet#getFindingAbouts() <em>Get Finding Abouts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InclusionorExclusionCriteriaNotMetOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InclusionorExclusionCriteriaNotMetOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.47')";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetTemplateId(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetClassCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetMoodCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (not self.id->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetId(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetCodeP(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = 'locally defined' and not value.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetCode(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::BL)))";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetValue(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::DataCollection) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Data Collection</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetDataCollection(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DATA_COLLECTION,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetComment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetComment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetComment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetComment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetComment(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_COMMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetComment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetDomainAssignment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetDomainAssignment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::DomainAssignment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetDomainAssignment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Domain Assignment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetDomainAssignment(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetDomainAssignment(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_DOMAIN_ASSIGNMENT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetDomainAssignment", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetRelatedRecord(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Related Record</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetRelatedRecord(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(sdtm::RelatedRecord) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::REFR)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetRelatedRecord(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Related Record</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetRelatedRecord(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetRelatedRecord(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_RELATED_RECORD,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetRelatedRecord", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetSupplementalValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Supplemental Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetSupplementalValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SupplementalValue) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetSupplementalValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Supplemental Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetSupplementalValue(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetSupplementalValue(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUPPLEMENTAL_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetSupplementalValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::Category) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::SubCategory) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Sub Category</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetSubCategory(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetSubCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_SUB_CATEGORY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetSubCategory", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateInclusionorExclusionCriteriaNotMetFindingAbout(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Finding About</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetFindingAbout(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(sdtm::FindingAbout) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateInclusionorExclusionCriteriaNotMetFindingAbout(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Inclusionor Exclusion Criteria Not Met Finding About</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateInclusionorExclusionCriteriaNotMetFindingAbout(InclusionorExclusionCriteriaNotMet, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param inclusionorExclusionCriteriaNotMet The receiving '<em><b>Inclusionor Exclusion Criteria Not Met</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateInclusionorExclusionCriteriaNotMetFindingAbout(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET);
			try {
				VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(inclusionorExclusionCriteriaNotMet)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET__INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET_FINDING_ABOUT,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InclusionorExclusionCriteriaNotMetFindingAbout", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(inclusionorExclusionCriteriaNotMet, context) }),
						 new Object [] { inclusionorExclusionCriteriaNotMet }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataCollection(InclusionorExclusionCriteriaNotMet) <em>Get Data Collection</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::DataCollection))->asSequence()->any(true).oclAsType(sdtm::DataCollection)";

	/**
	 * The cached OCL query for the '{@link #getDataCollection(InclusionorExclusionCriteriaNotMet) <em>Get Data Collection</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataCollection(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DataCollection getDataCollection(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_DATA_COLLECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(66));
			try {
				GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
		return (DataCollection) query.evaluate(inclusionorExclusionCriteriaNotMet);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComments(InclusionorExclusionCriteriaNotMet) <em>Get Comments</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Comment)).oclAsType(sdtm::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComments(InclusionorExclusionCriteriaNotMet) <em>Get Comments</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComments(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<Comment> getComments(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_COMMENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(67));
			try {
				GET_COMMENTS__EOCL_QRY = helper.createQuery(GET_COMMENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Comment> result = (Collection<Comment>) query.evaluate(inclusionorExclusionCriteriaNotMet);
		return new BasicEList.UnmodifiableEList<Comment>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getDomainAssignment(InclusionorExclusionCriteriaNotMet) <em>Get Domain Assignment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOMAIN_ASSIGNMENT__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::DomainAssignment))->asSequence()->any(true).oclAsType(sdtm::DomainAssignment)";

	/**
	 * The cached OCL query for the '{@link #getDomainAssignment(InclusionorExclusionCriteriaNotMet) <em>Get Domain Assignment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainAssignment(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOMAIN_ASSIGNMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  DomainAssignment getDomainAssignment(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_DOMAIN_ASSIGNMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(68));
			try {
				GET_DOMAIN_ASSIGNMENT__EOCL_QRY = helper.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOMAIN_ASSIGNMENT__EOCL_QRY);
		return (DomainAssignment) query.evaluate(inclusionorExclusionCriteriaNotMet);
	}

	/**
	 * The cached OCL expression body for the '{@link #getRelatedRecords(InclusionorExclusionCriteriaNotMet) <em>Get Related Records</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RELATED_RECORDS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::RelatedRecord)).oclAsType(sdtm::RelatedRecord)";

	/**
	 * The cached OCL query for the '{@link #getRelatedRecords(InclusionorExclusionCriteriaNotMet) <em>Get Related Records</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedRecords(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RELATED_RECORDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<RelatedRecord> getRelatedRecords(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_RELATED_RECORDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(69));
			try {
				GET_RELATED_RECORDS__EOCL_QRY = helper.createQuery(GET_RELATED_RECORDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RELATED_RECORDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RelatedRecord> result = (Collection<RelatedRecord>) query.evaluate(inclusionorExclusionCriteriaNotMet);
		return new BasicEList.UnmodifiableEList<RelatedRecord>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getSupplementalValues(InclusionorExclusionCriteriaNotMet) <em>Get Supplemental Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUPPLEMENTAL_VALUES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SupplementalValue)).oclAsType(sdtm::SupplementalValue)";

	/**
	 * The cached OCL query for the '{@link #getSupplementalValues(InclusionorExclusionCriteriaNotMet) <em>Get Supplemental Values</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupplementalValues(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUPPLEMENTAL_VALUES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<SupplementalValue> getSupplementalValues(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_SUPPLEMENTAL_VALUES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(70));
			try {
				GET_SUPPLEMENTAL_VALUES__EOCL_QRY = helper.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUPPLEMENTAL_VALUES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<SupplementalValue> result = (Collection<SupplementalValue>) query.evaluate(inclusionorExclusionCriteriaNotMet);
		return new BasicEList.UnmodifiableEList<SupplementalValue>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getCategory(InclusionorExclusionCriteriaNotMet) <em>Get Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::Category))->asSequence()->any(true).oclAsType(sdtm::Category)";

	/**
	 * The cached OCL query for the '{@link #getCategory(InclusionorExclusionCriteriaNotMet) <em>Get Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  Category getCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(71));
			try {
				GET_CATEGORY__EOCL_QRY = helper.createQuery(GET_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CATEGORY__EOCL_QRY);
		return (Category) query.evaluate(inclusionorExclusionCriteriaNotMet);
	}

	/**
	 * The cached OCL expression body for the '{@link #getSubCategory(InclusionorExclusionCriteriaNotMet) <em>Get Sub Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SUB_CATEGORY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::SubCategory))->asSequence()->any(true).oclAsType(sdtm::SubCategory)";

	/**
	 * The cached OCL query for the '{@link #getSubCategory(InclusionorExclusionCriteriaNotMet) <em>Get Sub Category</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubCategory(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SUB_CATEGORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  SubCategory getSubCategory(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_SUB_CATEGORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(72));
			try {
				GET_SUB_CATEGORY__EOCL_QRY = helper.createQuery(GET_SUB_CATEGORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SUB_CATEGORY__EOCL_QRY);
		return (SubCategory) query.evaluate(inclusionorExclusionCriteriaNotMet);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFindingAbouts(InclusionorExclusionCriteriaNotMet) <em>Get Finding Abouts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FINDING_ABOUTS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(sdtm::FindingAbout)).oclAsType(sdtm::FindingAbout)";

	/**
	 * The cached OCL query for the '{@link #getFindingAbouts(InclusionorExclusionCriteriaNotMet) <em>Get Finding Abouts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFindingAbouts(InclusionorExclusionCriteriaNotMet)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FINDING_ABOUTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	
	public static  EList<FindingAbout> getFindingAbouts(InclusionorExclusionCriteriaNotMet inclusionorExclusionCriteriaNotMet) {
		if (GET_FINDING_ABOUTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET, SdtmPackage.Literals.INCLUSIONOR_EXCLUSION_CRITERIA_NOT_MET.getEAllOperations().get(73));
			try {
				GET_FINDING_ABOUTS__EOCL_QRY = helper.createQuery(GET_FINDING_ABOUTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FINDING_ABOUTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<FindingAbout> result = (Collection<FindingAbout>) query.evaluate(inclusionorExclusionCriteriaNotMet);
		return new BasicEList.UnmodifiableEList<FindingAbout>(result.size(), result.toArray());
	}

} // InclusionorExclusionCriteriaNotMetOperations