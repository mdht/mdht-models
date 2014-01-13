/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment;

import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Extremities Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessment#validateExtremitiesAssessmentTargetSiteCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtremitiesAssessmentOperations extends ClinicalStatementOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtremitiesAssessmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentTemplateId(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTemplateId(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.120')";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentTemplateId(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTemplateId(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentTemplateId(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentTemplateId"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentMoodCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentMoodCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentMoodCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentMoodCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentMoodCode(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentMoodCode"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentCodeP(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentCodeP"),
						 new Object [] { extremitiesAssessment }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessmentCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessmentCodeP", passToken);
				}
				passToken.add(extremitiesAssessment);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67533-0' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentCode(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.emspcr.ExtremitiesAssessmentCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(extremitiesAssessment)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentCode"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentEffectiveTime(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentEffectiveTime(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentEffectiveTime(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentEffectiveTime(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentEffectiveTime(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentEffectiveTime"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentValue(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentValue(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA17208-2' or value.code = 'LA17209-0' or value.code = 'LA17214-0' or value.code = 'LA17215-7' or value.code = 'LA17220-7' or value.code = 'LA17229-8' or value.code = 'LA17244-7' or value.code = 'LA17245-4' or value.code = 'LA17260-3' or value.code = 'LA17261-1' or value.code = 'LA17262-9' or value.code = 'LA17263-7' or value.code = 'LA17264-5' or value.code = 'LA17265-2' or value.code = 'LA17266-0' or value.code = 'LA17267-8' or value.code = 'LA17268-6' or value.code = 'LA17269-4' or value.code = 'LA17270-2' or value.code = 'LA17271-0' or value.code = 'LA17272-8' or value.code = 'LA17273-6' or value.code = 'LA17274-4' or value.code = 'LA17344-5' or value.code = 'LA17709-9' or value.code = 'LA18220-6' or value.code = 'LA18222-2' or value.code = 'LA18223-0' or value.code = 'LA18224-8' or value.code = 'LA18225-5' or value.code = 'LA18226-3' or value.code = 'LA18249-5' or value.code = 'LA6626-1' or value.code = 'LA6630-3' or value.code = 'LA7410-9' or value.code = 'LA7452-1' or value.code = 'LA7460-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentValue(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentValue(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentValue(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_VALUE,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentValue"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentTargetSiteCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTargetSiteCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1 and self.targetSiteCode->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA18739-5' or value.code = 'LA18740-3' or value.code = 'LA18741-1' or value.code = 'LA18742-9' or value.code = 'LA18743-7' or value.code = 'LA18744-5' or value.code = 'LA18745-2' or value.code = 'LA18746-0' or value.code = 'LA18747-8' or value.code = 'LA18748-6' or value.code = 'LA18749-4' or value.code = 'LA18750-2' or value.code = 'LA18751-0' or value.code = 'LA18752-8' or value.code = 'LA18753-6' or value.code = 'LA18754-4' or value.code = 'LA18755-1' or value.code = 'LA18756-9' or value.code = 'LA18757-7' or value.code = 'LA18758-5' or value.code = 'LA18759-3' or value.code = 'LA18760-1' or value.code = 'LA18761-9' or value.code = 'LA18762-7' or value.code = 'LA18763-5' or value.code = 'LA18764-3' or value.code = 'LA18765-0' or value.code = 'LA18766-8' or value.code = 'LA18767-6' or value.code = 'LA18768-4' or value.code = 'LA18769-2' or value.code = 'LA18770-0' or value.code = 'LA18771-8' or value.code = 'LA18772-6' or value.code = 'LA18773-4' or value.code = 'LA18774-2' or value.code = 'LA18775-9' or value.code = 'LA18776-7' or value.code = 'LA18777-5' or value.code = 'LA18778-3' or value.code = 'LA18779-1' or value.code = 'LA18780-9' or value.code = 'LA18781-7' or value.code = 'LA18782-5' or value.code = 'LA18783-3' or value.code = 'LA18784-1' or value.code = 'LA18785-8' or value.code = 'LA18786-6')))";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentTargetSiteCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTargetSiteCode(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentTargetSiteCode(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentTargetSiteCode"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateExtremitiesAssessmentTargetSiteCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTargetSiteCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (self.targetSiteCode->size() = 1)";

	/**
	 * The cached OCL invariant for the '{@link #validateExtremitiesAssessmentTargetSiteCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Extremities Assessment Target Site Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateExtremitiesAssessmentTargetSiteCodeP(ExtremitiesAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param extremitiesAssessment The receiving '<em><b>Extremities Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateExtremitiesAssessmentTargetSiteCodeP(ExtremitiesAssessment extremitiesAssessment, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
		if (VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.EXTREMITIES_ASSESSMENT);
			try {
				VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(extremitiesAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.EXTREMITIES_ASSESSMENT__EXTREMITIES_ASSESSMENT_TARGET_SITE_CODE_P,
						 EmspcrPlugin.INSTANCE.getString("ExtremitiesAssessmentTargetSiteCodeP"),
						 new Object [] { extremitiesAssessment }));
			}
			 
			return false;
		}
		return true;
	}

} // ExtremitiesAssessmentOperations