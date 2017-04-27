/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.CriterionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Criterion Pattern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern#validateCriterionPatternTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern#validateCriterionPatternClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern#validateCriterionPatternCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern#validateCriterionPatternMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CriterionPattern#validateCriterionPatternValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CriterionPatternOperations extends CriterionOperations {
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
	protected CriterionPatternOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriterionPatternTemplateId(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternTemplateId(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriterionPatternTemplateId(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternTemplateId(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criterionPattern The receiving '<em><b>Criterion Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCriterionPatternTemplateId(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.CRITERION_PATTERN);
			try {
				VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CRITERION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(criterionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.CRITERION_PATTERN__CRITERION_PATTERN_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("CriterionPatternCriterionPatternTemplateId"),
						 new Object [] { criterionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriterionPatternClassCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternClassCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriterionPatternClassCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternClassCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criterionPattern The receiving '<em><b>Criterion Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCriterionPatternClassCode(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.CRITERION_PATTERN);
			try {
				VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CRITERION_PATTERN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(criterionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.CRITERION_PATTERN__CRITERION_PATTERN_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("CriterionPatternCriterionPatternClassCode"),
						 new Object [] { criterionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriterionPatternCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriterionPatternCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criterionPattern The receiving '<em><b>Criterion Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCriterionPatternCode(CriterionPattern criterionPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.CRITERION_PATTERN);
			try {
				VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CRITERION_PATTERN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(criterionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.CRITERION_PATTERN__CRITERION_PATTERN_CODE,
						 QFDDPlugin.INSTANCE.getString("CriterionPatternCriterionPatternCode"),
						 new Object [] { criterionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriterionPatternMoodCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternMoodCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCriterionPatternMoodCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternMoodCode(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criterionPattern The receiving '<em><b>Criterion Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCriterionPatternMoodCode(CriterionPattern criterionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.CRITERION_PATTERN);
			try {
				VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CRITERION_PATTERN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(criterionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.CRITERION_PATTERN__CRITERION_PATTERN_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("CriterionPatternCriterionPatternMoodCode"),
						 new Object [] { criterionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCriterionPatternValue(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternValue(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value.oclIsUndefined() or self.value.isNullFlavorUndefined()) implies (not self.value.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCriterionPatternValue(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Criterion Pattern Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCriterionPatternValue(CriterionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param criterionPattern The receiving '<em><b>Criterion Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCriterionPatternValue(CriterionPattern criterionPattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.CRITERION_PATTERN);
			try {
				VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_CRITERION_PATTERN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(criterionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.CRITERION_PATTERN__CRITERION_PATTERN_VALUE,
						 QFDDPlugin.INSTANCE.getString("CriterionPatternCriterionPatternValue"),
						 new Object [] { criterionPattern }));
			}
			 
			return false;
		}
		return true;
	}

} // CriterionPatternOperations
