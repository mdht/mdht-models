/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Wound Characteristic</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicStatusCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicStatusCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristic#validateWoundCharacteristicValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WoundCharacteristicOperations extends ClinicalStatementOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
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
	protected WoundCharacteristicOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicTemplateId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicTemplateId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.134')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicTemplateId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicTemplateId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicTemplateId(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicTemplateId"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicClassCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicClassCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::ActClassObservation::OBS";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicClassCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicClassCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicClassCode(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicClassCode","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_CLASS_CODE,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicClassCode"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicMoodCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicMoodCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_ActMoodDocumentObservation::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicMoodCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicMoodCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicMoodCode(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicMoodCode","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_MOOD_CODE,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicMoodCode"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.id->isEmpty() or self.id->exists(element | element.isNullFlavorUndefined())) implies (( not self.id->isEmpty()) )";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicId(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicId(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicId","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_ID,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicId"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicCodeP(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_CODE_P,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicCodeP"),
						 new Object [] { woundCharacteristic }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicCodeP", passToken);
				}
				passToken.add(woundCharacteristic);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'ASSERTION' and value.codeSystem = '2.16.840.1.113883.5.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicCode(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.WoundCharacteristicCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(woundCharacteristic)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicCode","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_CODE,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicCode"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicStatusCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicStatusCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined() and self.statusCode.oclIsKindOf(datatypes::CS) and "+
"let value : datatypes::CS = self.statusCode.oclAsType(datatypes::CS) in "+
"value.code = 'completed')";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicStatusCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicStatusCode(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicStatusCode(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicStatusCode","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_STATUS_CODE,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicStatusCode"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicStatusCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicStatusCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.statusCode.oclIsUndefined() or self.statusCode.isNullFlavorUndefined()) implies (not self.statusCode.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicStatusCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Status Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicStatusCodeP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicStatusCodeP(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicStatusCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_STATUS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_STATUS_CODE_P,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicStatusCodeP"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicEffectiveTime(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicEffectiveTime(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicEffectiveTime(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Effective Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicEffectiveTime(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicEffectiveTime(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicEffectiveTime","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_EFFECTIVE_TIME,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicEffectiveTime"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicValue(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicValue(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96' and not value.code.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicValue(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicValue(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicValue(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicValue","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_VALUE,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicValue"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateWoundCharacteristicValueP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicValueP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateWoundCharacteristicValueP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Wound Characteristic Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateWoundCharacteristicValueP(WoundCharacteristic, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param woundCharacteristic The receiving '<em><b>Wound Characteristic</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateWoundCharacteristicValueP(WoundCharacteristic woundCharacteristic,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"WoundCharacteristicWoundCharacteristicValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.WOUND_CHARACTERISTIC);
			try {
				VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_WOUND_CHARACTERISTIC_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(woundCharacteristic)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.WOUND_CHARACTERISTIC__WOUND_CHARACTERISTIC_VALUE_P,
						 ConsolPlugin.INSTANCE.getString("WoundCharacteristicWoundCharacteristicValueP"),
						 new Object [] { woundCharacteristic }));
			}
			 
			return false;
		}
		return true;
	}

} // WoundCharacteristicOperations
