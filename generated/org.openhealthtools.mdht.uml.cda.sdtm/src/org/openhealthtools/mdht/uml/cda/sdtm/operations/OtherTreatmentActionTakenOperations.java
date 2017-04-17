/**
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Treatment Action Taken</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.OtherTreatmentActionTaken#validateOtherTreatmentActionTakenValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherTreatmentActionTakenOperations extends org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations {
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
	protected OtherTreatmentActionTakenOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenTemplateId(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenTemplateId(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.63')";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenTemplateId(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenTemplateId(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenTemplateId(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_TEMPLATE_ID,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenClassCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenClassCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenClassCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenClassCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenClassCode(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_CLASS_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenMoodCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenMoodCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenMoodCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenMoodCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenMoodCode(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_MOOD_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenCodeP(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenCodeP(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenCodeP(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenCodeP(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenCodeP(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_CODE_P,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'OATtbd' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenCode(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenCode(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_CODE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateOtherTreatmentActionTakenValue(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenValue(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

	/**
	 * The cached OCL invariant for the '{@link #validateOtherTreatmentActionTakenValue(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Treatment Action Taken Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateOtherTreatmentActionTakenValue(OtherTreatmentActionTaken, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static ThreadLocal<  Constraint> VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param otherTreatmentActionTaken The receiving '<em><b>Other Treatment Action Taken</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateOtherTreatmentActionTakenValue(OtherTreatmentActionTaken otherTreatmentActionTaken, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(SdtmPackage.Literals.OTHER_TREATMENT_ACTION_TAKEN);
			try {
				VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_OTHER_TREATMENT_ACTION_TAKEN_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(otherTreatmentActionTaken)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 SdtmValidator.DIAGNOSTIC_SOURCE,
						 SdtmValidator.OTHER_TREATMENT_ACTION_TAKEN__OTHER_TREATMENT_ACTION_TAKEN_VALUE,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "OtherTreatmentActionTakenOtherTreatmentActionTakenValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(otherTreatmentActionTaken, context) }),
						 new Object [] { otherTreatmentActionTaken }));
			}
			 
			return false;
		}
		return true;
	}

} // OtherTreatmentActionTakenOperations