/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPlugin;
import org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment;
import org.openhealthtools.mdht.uml.cda.emspcr.util.EmspcrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pelvic And Genitourinary Assessment</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.emspcr.PelvicAndGenitourinaryAssessment#validatePelvicAndGenitourinaryAssessmentValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PelvicAndGenitourinaryAssessmentOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
	protected static final ThreadLocal< OCL > EOCL_ENV = new ThreadLocal< OCL >() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PelvicAndGenitourinaryAssessmentOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentTemplateId(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentTemplateId(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.1133883.17.3.10.1.118')";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentTemplateId(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentTemplateId(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentTemplateId(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_TEMPLATE_ID,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentTemplateId"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentMoodCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentMoodCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentMoodCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentMoodCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentMoodCode(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_MOOD_CODE,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentMoodCode"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '67531-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentCode(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentCode(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_CODE,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentCode"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentEffectiveTime(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentEffectiveTime(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentEffectiveTime(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentEffectiveTime(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentEffectiveTime(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_EFFECTIVE_TIME,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentEffectiveTime"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentValue(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentValue(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.1' and (value.code = 'LA14123-6' or value.code = 'LA17208-2' or value.code = 'LA17209-0' or value.code = 'LA17213-2' or value.code = 'LA17214-0' or value.code = 'LA17215-7' or value.code = 'LA17220-7' or value.code = 'LA17244-7' or value.code = 'LA17245-4' or value.code = 'LA17248-8' or value.code = 'LA17249-6' or value.code = 'LA17250-4' or value.code = 'LA17251-2' or value.code = 'LA17252-0' or value.code = 'LA17253-8' or value.code = 'LA17254-6' or value.code = 'LA17255-3' or value.code = 'LA17709-9' or value.code = 'LA18220-6' or value.code = 'LA18221-4' or value.code = 'LA18222-2' or value.code = 'LA18223-0' or value.code = 'LA18224-8' or value.code = 'LA18225-5' or value.code = 'LA18226-3' or value.code = 'LA6626-1' or value.code = 'LA6630-3' or value.code = 'LA7410-9' or value.code = 'LA7452-1' or value.code = 'LA7460-4')))";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentValue(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentValue(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentValue(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentValue"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePelvicAndGenitourinaryAssessmentValueP(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentValueP(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty() and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validatePelvicAndGenitourinaryAssessmentValueP(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pelvic And Genitourinary Assessment Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePelvicAndGenitourinaryAssessmentValueP(PelvicAndGenitourinaryAssessment, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pelvicAndGenitourinaryAssessment The receiving '<em><b>Pelvic And Genitourinary Assessment</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePelvicAndGenitourinaryAssessmentValueP(
			PelvicAndGenitourinaryAssessment pelvicAndGenitourinaryAssessment, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(EmspcrPackage.Literals.PELVIC_AND_GENITOURINARY_ASSESSMENT);
			try {
				VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pelvicAndGenitourinaryAssessment)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 EmspcrValidator.DIAGNOSTIC_SOURCE,
						 EmspcrValidator.PELVIC_AND_GENITOURINARY_ASSESSMENT__PELVIC_AND_GENITOURINARY_ASSESSMENT_VALUE_P,
						 EmspcrPlugin.INSTANCE.getString("PelvicAndGenitourinaryAssessmentPelvicAndGenitourinaryAssessmentValueP"),
						 new Object [] { pelvicAndGenitourinaryAssessment }));
			}
			 
			return false;
		}
		return true;
	}

} // PelvicAndGenitourinaryAssessmentOperations
