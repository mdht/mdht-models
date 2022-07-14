/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ClinicalStatementOperations;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Device Identifier Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIUDIissuingagency(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation IIUD Iissuingagency</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIRoot(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Root</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIExtension(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Extension</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservation#validateDeviceIdentifierObservationIIDisplayable(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Displayable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DeviceIdentifierObservationOperations extends ClinicalStatementOperations {
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
	protected DeviceIdentifierObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationTemplateId(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationTemplateId(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.304' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationTemplateId(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationTemplateId(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeviceIdentifierObservationTemplateId(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deviceIdentifierObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationTemplateId"),
						 new Object [] { deviceIdentifierObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationCodeP(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationCodeP(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationCodeP(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationCodeP(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeviceIdentifierObservationCodeP(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deviceIdentifierObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationCodeP"),
						 new Object [] { deviceIdentifierObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationCodeP", passToken);
				}
				passToken.add(deviceIdentifierObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationCode(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationCode(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C101722' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationCode(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationCode(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeviceIdentifierObservationCode(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DeviceIdentifierObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(deviceIdentifierObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deviceIdentifierObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationCode"),
						 new Object [] { deviceIdentifierObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationValue(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationValue(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::II)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationValue(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationValue(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeviceIdentifierObservationValue(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deviceIdentifierObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationValue"),
						 new Object [] { deviceIdentifierObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation IIUD Iissuingagency</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * issue with inlined datatype ocl generation
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->exists( isNullFlavorDefined() or (  matches('root','\\\\b1.3.160\\\\b') or  matches('root','\\\\b2.16.840.1.113883.6.18\\\\b') or  matches('root','\\\\b2.16.840.1.113883.6.40\\\\b') ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation IIUD Iissuingagency</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIUDIissuingagency(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDeviceIdentifierObservationIIUDIissuingagency(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationIIUDIissuingagency","null");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(deviceIdentifierObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_IIUD_IISSUINGAGENCY,
						 org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "DeviceIdentifierObservationDeviceIdentifierObservationIIUDIissuingagency", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(deviceIdentifierObservation, context) }),
						 new Object [] { deviceIdentifierObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Root</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * issue with inlined datatype ocl generation
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or isDefined('root') )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Root</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIRoot(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationIIRoot(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationIIRoot","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_ROOT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(deviceIdentifierObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_II_ROOT,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationIIRoot"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Extension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or isDefined('extension') )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Extension</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIExtension(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationIIExtension(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationIIExtension","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(deviceIdentifierObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_II_EXTENSION,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationIIExtension"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDeviceIdentifierObservationIIDisplayable(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Displayable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIDisplayable(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated NOT
	 * @ordered
	 */
	protected static final String VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.value->excluding(null)->select(isNullFlavorUndefined())->reject( isNullFlavorDefined() or (isDefined('displayable') and (self.value.oclAsType(datatypes::II).displayable->asSequence()->first()  ) ) )";

	/**
	 * The cached OCL invariant for the '{@link #validateDeviceIdentifierObservationIIDisplayable(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Device Identifier Observation II Displayable</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDeviceIdentifierObservationIIDisplayable(DeviceIdentifierObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param deviceIdentifierObservation The receiving '<em><b>Device Identifier Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateDeviceIdentifierObservationIIDisplayable(
			DeviceIdentifierObservation deviceIdentifierObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DeviceIdentifierObservationDeviceIdentifierObservationIIDisplayable","ERROR");
    
  	  
  	  
		if (VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DEVICE_IDENTIFIER_OBSERVATION);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(deviceIdentifierObservation);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DEVICE_IDENTIFIER_OBSERVATION__DEVICE_IDENTIFIER_OBSERVATION_II_DISPLAYABLE,
						 ConsolPlugin.INSTANCE.getString("DeviceIdentifierObservationDeviceIdentifierObservationIIDisplayable"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // DeviceIdentifierObservationOperations
