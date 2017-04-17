/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.PreconditionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Precondition Pattern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern#validatePreconditionPatternTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern#validatePreconditionPatternTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.PreconditionPattern#validatePreconditionPatternCriterion(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Criterion</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreconditionPatternOperations extends PreconditionOperations {
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
	protected PreconditionPatternOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionPatternTemplateId(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternTemplateId(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.4')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionPatternTemplateId(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternTemplateId(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionPattern The receiving '<em><b>Precondition Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionPatternTemplateId(PreconditionPattern preconditionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.PRECONDITION_PATTERN);
			try {
				VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRECONDITION_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(preconditionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.PRECONDITION_PATTERN__PRECONDITION_PATTERN_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("PreconditionPatternPreconditionPatternTemplateId"),
						 new Object [] { preconditionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionPatternTypeCode(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternTypeCode(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionPatternTypeCode(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternTypeCode(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionPattern The receiving '<em><b>Precondition Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionPatternTypeCode(PreconditionPattern preconditionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.PRECONDITION_PATTERN);
			try {
				VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRECONDITION_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(preconditionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.PRECONDITION_PATTERN__PRECONDITION_PATTERN_TYPE_CODE,
						 QFDDPlugin.INSTANCE.getString("PreconditionPatternPreconditionPatternTypeCode"),
						 new Object [] { preconditionPattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePreconditionPatternCriterion(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Criterion</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternCriterion(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.criterion->one(criterion : cda::Criterion | not criterion.oclIsUndefined() and criterion.oclIsKindOf(rim::Act))";

	/**
	 * The cached OCL invariant for the '{@link #validatePreconditionPatternCriterion(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Precondition Pattern Criterion</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePreconditionPatternCriterion(PreconditionPattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param preconditionPattern The receiving '<em><b>Precondition Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validatePreconditionPatternCriterion(PreconditionPattern preconditionPattern,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.PRECONDITION_PATTERN);
			try {
				VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_PRECONDITION_PATTERN_CRITERION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(preconditionPattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.PRECONDITION_PATTERN__PRECONDITION_PATTERN_CRITERION,
						 QFDDPlugin.INSTANCE.getString("PreconditionPatternPreconditionPatternCriterion"),
						 new Object [] { preconditionPattern }));
			}
			 
			return false;
		}
		return true;
	}

} // PreconditionPatternOperations
