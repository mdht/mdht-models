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
import org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Implantable Device Status Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservation#validateImplantableDeviceStatusObservationValueP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value P</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImplantableDeviceStatusObservationOperations extends ClinicalStatementOperations {
	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
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
	protected ImplantableDeviceStatusObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImplantableDeviceStatusObservationTemplateId(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationTemplateId(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.305' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateImplantableDeviceStatusObservationTemplateId(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationTemplateId(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param implantableDeviceStatusObservation The receiving '<em><b>Implantable Device Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImplantableDeviceStatusObservationTemplateId(ImplantableDeviceStatusObservation implantableDeviceStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ImplantableDeviceStatusObservationImplantableDeviceStatusObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION);
			try {
				VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(implantableDeviceStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMPLANTABLE_DEVICE_STATUS_OBSERVATION__IMPLANTABLE_DEVICE_STATUS_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("ImplantableDeviceStatusObservationImplantableDeviceStatusObservationTemplateId"),
						 new Object [] { implantableDeviceStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImplantableDeviceStatusObservationCodeP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationCodeP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateImplantableDeviceStatusObservationCodeP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationCodeP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param implantableDeviceStatusObservation The receiving '<em><b>Implantable Device Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImplantableDeviceStatusObservationCodeP(ImplantableDeviceStatusObservation implantableDeviceStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ImplantableDeviceStatusObservationImplantableDeviceStatusObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION);
			try {
				VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(implantableDeviceStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMPLANTABLE_DEVICE_STATUS_OBSERVATION__IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("ImplantableDeviceStatusObservationImplantableDeviceStatusObservationCodeP"),
						 new Object [] { implantableDeviceStatusObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservationCodeP", passToken);
				}
				passToken.add(implantableDeviceStatusObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImplantableDeviceStatusObservationCode(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationCode(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C160939' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateImplantableDeviceStatusObservationCode(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationCode(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param implantableDeviceStatusObservation The receiving '<em><b>Implantable Device Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImplantableDeviceStatusObservationCode(ImplantableDeviceStatusObservation implantableDeviceStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.ImplantableDeviceStatusObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(implantableDeviceStatusObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ImplantableDeviceStatusObservationImplantableDeviceStatusObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION);
			try {
				VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(implantableDeviceStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMPLANTABLE_DEVICE_STATUS_OBSERVATION__IMPLANTABLE_DEVICE_STATUS_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("ImplantableDeviceStatusObservationImplantableDeviceStatusObservationCode"),
						 new Object [] { implantableDeviceStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImplantableDeviceStatusObservationValue(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationValue(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() = 1 and self.value->forAll(element | not element.oclIsUndefined() and element.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = element.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.3.26.1.1' and (value.code = 'C45329' or value.code = 'C154407' or value.code = 'C122711' or value.code = 'C160942')))";

	/**
	 * The cached OCL invariant for the '{@link #validateImplantableDeviceStatusObservationValue(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationValue(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param implantableDeviceStatusObservation The receiving '<em><b>Implantable Device Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImplantableDeviceStatusObservationValue(ImplantableDeviceStatusObservation implantableDeviceStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ImplantableDeviceStatusObservationImplantableDeviceStatusObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION);
			try {
				VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(implantableDeviceStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMPLANTABLE_DEVICE_STATUS_OBSERVATION__IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("ImplantableDeviceStatusObservationImplantableDeviceStatusObservationValue"),
						 new Object [] { implantableDeviceStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateImplantableDeviceStatusObservationValueP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationValueP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::CD)))";

	/**
	 * The cached OCL invariant for the '{@link #validateImplantableDeviceStatusObservationValueP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Implantable Device Status Observation Value P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateImplantableDeviceStatusObservationValueP(ImplantableDeviceStatusObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param implantableDeviceStatusObservation The receiving '<em><b>Implantable Device Status Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static  boolean validateImplantableDeviceStatusObservationValueP(ImplantableDeviceStatusObservation implantableDeviceStatusObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"ImplantableDeviceStatusObservationImplantableDeviceStatusObservationValueP","ERROR");
    
  	  
  	  
		if (VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.IMPLANTABLE_DEVICE_STATUS_OBSERVATION);
			try {
				VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(implantableDeviceStatusObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.IMPLANTABLE_DEVICE_STATUS_OBSERVATION__IMPLANTABLE_DEVICE_STATUS_OBSERVATION_VALUE_P,
						 ConsolPlugin.INSTANCE.getString("ImplantableDeviceStatusObservationImplantableDeviceStatusObservationValueP"),
						 new Object [] { implantableDeviceStatusObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // ImplantableDeviceStatusObservationOperations