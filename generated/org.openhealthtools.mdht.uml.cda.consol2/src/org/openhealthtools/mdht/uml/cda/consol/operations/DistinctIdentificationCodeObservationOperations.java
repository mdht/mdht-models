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
import org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Distinct Identification Code Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservation#validateDistinctIdentificationCodeObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DistinctIdentificationCodeObservationOperations extends ClinicalStatementOperations {
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
	protected DistinctIdentificationCodeObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDistinctIdentificationCodeObservationTemplateId(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationTemplateId(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.4.308' and id.extension = '2019-06-21')";

	/**
	 * The cached OCL invariant for the '{@link #validateDistinctIdentificationCodeObservationTemplateId(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationTemplateId(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param distinctIdentificationCodeObservation The receiving '<em><b>Distinct Identification Code Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDistinctIdentificationCodeObservationTemplateId(
			DistinctIdentificationCodeObservation distinctIdentificationCodeObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationTemplateId","ERROR");
    
  	  
  	  
		if (VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISTINCT_IDENTIFICATION_CODE_OBSERVATION);
			try {
				VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(distinctIdentificationCodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DISTINCT_IDENTIFICATION_CODE_OBSERVATION_TEMPLATE_ID,
						 ConsolPlugin.INSTANCE.getString("DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationTemplateId"),
						 new Object [] { distinctIdentificationCodeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDistinctIdentificationCodeObservationCodeP(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationCodeP(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateDistinctIdentificationCodeObservationCodeP(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationCodeP(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param distinctIdentificationCodeObservation The receiving '<em><b>Distinct Identification Code Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDistinctIdentificationCodeObservationCodeP(
			DistinctIdentificationCodeObservation distinctIdentificationCodeObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationCodeP","ERROR");
    
  	  
  	  
		if (VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISTINCT_IDENTIFICATION_CODE_OBSERVATION);
			try {
				VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(distinctIdentificationCodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE_P,
						 ConsolPlugin.INSTANCE.getString("DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationCodeP"),
						 new Object [] { distinctIdentificationCodeObservation }));
			}
			
			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservationCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put("org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservationCodeP", passToken);
				}
				passToken.add(distinctIdentificationCodeObservation);
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDistinctIdentificationCodeObservationCode(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationCode(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'C113843' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateDistinctIdentificationCodeObservationCode(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationCode(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param distinctIdentificationCodeObservation The receiving '<em><b>Distinct Identification Code Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDistinctIdentificationCodeObservationCode(
			DistinctIdentificationCodeObservation distinctIdentificationCodeObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
		Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.consol.DistinctIdentificationCodeObservationCodeP");
		if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(distinctIdentificationCodeObservation)) {
			// I have a free pass to short-circuit
			return true;
		}
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationCode","ERROR");
    
  	  
  	  
		if (VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISTINCT_IDENTIFICATION_CODE_OBSERVATION);
			try {
				VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(distinctIdentificationCodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DISTINCT_IDENTIFICATION_CODE_OBSERVATION_CODE,
						 ConsolPlugin.INSTANCE.getString("DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationCode"),
						 new Object [] { distinctIdentificationCodeObservation }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateDistinctIdentificationCodeObservationValue(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationValue(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (self.value->size() =  1 and self.value->forAll(element | element.oclIsTypeOf(datatypes::ED)))";

	/**
	 * The cached OCL invariant for the '{@link #validateDistinctIdentificationCodeObservationValue(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Distinct Identification Code Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateDistinctIdentificationCodeObservationValue(DistinctIdentificationCodeObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<  Constraint> VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param distinctIdentificationCodeObservation The receiving '<em><b>Distinct Identification Code Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateDistinctIdentificationCodeObservationValue(
			DistinctIdentificationCodeObservation distinctIdentificationCodeObservation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
  	  
  	  
  	 
  	 
  	 
    DatatypesUtil.increment(context,"DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationValue","ERROR");
    
  	  
  	  
		if (VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.DISTINCT_IDENTIFICATION_CODE_OBSERVATION);
			try {
				VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(distinctIdentificationCodeObservation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 ConsolValidator.DIAGNOSTIC_SOURCE,
						 ConsolValidator.DISTINCT_IDENTIFICATION_CODE_OBSERVATION__DISTINCT_IDENTIFICATION_CODE_OBSERVATION_VALUE,
						 ConsolPlugin.INSTANCE.getString("DistinctIdentificationCodeObservationDistinctIdentificationCodeObservationValue"),
						 new Object [] { distinctIdentificationCodeObservation }));
			}
			 
			return false;
		}
		return true;
	}

} // DistinctIdentificationCodeObservationOperations
