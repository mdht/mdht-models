/**
 */
package org.openhealthtools.mdht.uml.cda.qfdd.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPackage;
import org.openhealthtools.mdht.uml.cda.qfdd.QFDDPlugin;
import org.openhealthtools.mdht.uml.cda.qfdd.util.QFDDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Copy Right Pattern Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qfdd.CopyRightPatternObservation#validateCopyRightPatternObservationLanguageCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Language Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CopyRightPatternObservationOperations extends ClinicalStatementOperations {
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
	protected CopyRightPatternObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationTemplateId(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationTemplateId(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.32.4.21')";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationTemplateId(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationTemplateId(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationTemplateId(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_TEMPLATE_ID,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationTemplateId"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationClassCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationClassCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationClassCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationClassCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationClassCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_CLASS_CODE,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationClassCode"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'COPY' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_CODE,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationCode"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationMoodCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationMoodCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationMoodCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationMoodCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationMoodCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_MOOD_CODE,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationMoodCode"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationValue(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationValue(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ST)))";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationValue(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationValue(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationValue(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_VALUE,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationValue"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateCopyRightPatternObservationLanguageCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationLanguageCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.languageCode.oclIsUndefined() or self.languageCode.isNullFlavorUndefined()) implies (not self.languageCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateCopyRightPatternObservationLanguageCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Copy Right Pattern Observation Language Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateCopyRightPatternObservationLanguageCode(CopyRightPatternObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param copyRightPatternObservation The receiving '<em><b>Copy Right Pattern Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateCopyRightPatternObservationLanguageCode(
			CopyRightPatternObservation copyRightPatternObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QFDDPackage.Literals.COPY_RIGHT_PATTERN_OBSERVATION);
			try {
				VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(copyRightPatternObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 QFDDValidator.DIAGNOSTIC_SOURCE,
						 QFDDValidator.COPY_RIGHT_PATTERN_OBSERVATION__COPY_RIGHT_PATTERN_OBSERVATION_LANGUAGE_CODE,
						 QFDDPlugin.INSTANCE.getString("CopyRightPatternObservationCopyRightPatternObservationLanguageCode"),
						 new Object [] { copyRightPatternObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // CopyRightPatternObservationOperations
