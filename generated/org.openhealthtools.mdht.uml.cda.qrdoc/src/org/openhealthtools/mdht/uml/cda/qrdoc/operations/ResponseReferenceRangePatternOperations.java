/**
 */
package org.openhealthtools.mdht.uml.cda.qrdoc.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.uml.cda.operations.ReferenceRangeOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPackage;
import org.openhealthtools.mdht.uml.cda.qrdoc.QRDOCPlugin;
import org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern;
import org.openhealthtools.mdht.uml.cda.qrdoc.util.QRDOCValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Response Reference Range Pattern</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternObservationRange(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternObservationRangeIVLINTHigh(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT High</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternObservationRangeIVLINTLow(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT Low</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternObservationRangeText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.qrdoc.ResponseReferenceRangePattern#validateResponseReferenceRangePatternObservationRangeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseReferenceRangePatternOperations extends ReferenceRangeOperations {
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
	protected ResponseReferenceRangePatternOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternTemplateId(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternTemplateId(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.33.4.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternTemplateId(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternTemplateId(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseReferenceRangePatternTemplateId(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_TEMPLATE_ID,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternTemplateId"),
						 new Object [] { responseReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternTypeCode(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternTypeCode(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('typeCode')";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternTypeCode(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternTypeCode(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseReferenceRangePatternTypeCode(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_TYPE_CODE,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternTypeCode"),
						 new Object [] { responseReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternObservationRange(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRange(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->one(observationRange : cda::ObservationRange | not observationRange.oclIsUndefined() and observationRange.oclIsKindOf(cda::ObservationRange))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternObservationRange(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRange(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<  Constraint> VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new  ThreadLocal<  Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateResponseReferenceRangePatternObservationRange(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(helper.createInvariant(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		if (!EOCL_ENV.get().createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(responseReferenceRangePattern)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternObservationRange"),
						 new Object [] { responseReferenceRangePattern }));
			}
			 
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternObservationRangeIVLINTHigh(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT High</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeIVLINTHigh(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::IVL_INT)->reject( v : datatypes::IVL_INT | ( v.isNullFlavorUndefined() implies ((v.high.oclIsUndefined() or v.high.isNullFlavorUndefined()) implies (not v.high.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternObservationRangeIVLINTHigh(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT High</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeIVLINTHigh(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResponseReferenceRangePatternObservationRangeIVLINTHigh(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(responseReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_HIGH,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternObservationRangeIVLINTHigh"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternObservationRangeIVLINTLow(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT Low</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeIVLINTLow(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated not
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null).value->excluding(null)->select(isNullFlavorUndefined()).oclAsType(datatypes::IVL_INT)->reject( v: datatypes::IVL_INT |  (v.isNullFlavorUndefined() implies ((v.low.oclIsUndefined() or v.low.isNullFlavorUndefined()) implies (not v.low.oclIsUndefined()) )))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternObservationRangeIVLINTLow(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range IVLINT Low</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeIVLINTLow(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResponseReferenceRangePatternObservationRangeIVLINTLow(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(responseReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_IVLINT_LOW,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternObservationRangeIVLINTLow"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternObservationRangeText(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeText(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null)->reject((text.oclIsUndefined() or text.isNullFlavorUndefined()) implies (not text.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternObservationRangeText(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeText(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResponseReferenceRangePatternObservationRangeText(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(responseReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_TEXT,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternObservationRangeText"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateResponseReferenceRangePatternObservationRangeValue(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeValue(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.observationRange->excluding(null)->reject((value.oclIsUndefined() or value.isNullFlavorUndefined()) implies (not value.oclIsUndefined() and value.oclIsTypeOf(datatypes::IVL_INT)))";

	/**
	 * The cached OCL invariant for the '{@link #validateResponseReferenceRangePatternObservationRangeValue(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Response Reference Range Pattern Observation Range Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateResponseReferenceRangePatternObservationRangeValue(ResponseReferenceRangePattern, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal< Query<?, ?, ?> > VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = new ThreadLocal< Query<?, ?, ?> >();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param responseReferenceRangePattern The receiving '<em><b>Response Reference Range Pattern</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public static boolean validateResponseReferenceRangePatternObservationRangeValue(
			ResponseReferenceRangePattern responseReferenceRangePattern, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
	
	
	
  	  
  	  
   
  	  
  	  
		if (VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get() == null) {
		
	 
			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(QRDOCPackage.Literals.RESPONSE_REFERENCE_RANGE_PATTERN);
			try {
				OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
				VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.set(EOCL_ENV.get().createQuery(oclExpression));
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
			}
		 
		Object oclResult = VALIDATE_RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.get().evaluate(responseReferenceRangePattern);		
		if (oclResult != null && oclResult instanceof Collection) {
			Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
			if (diagnostics != null) {
				for (EObject eObject : oclResultSet) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 QRDOCValidator.DIAGNOSTIC_SOURCE,
						 QRDOCValidator.RESPONSE_REFERENCE_RANGE_PATTERN__RESPONSE_REFERENCE_RANGE_PATTERN_OBSERVATION_RANGE_VALUE,
						 QRDOCPlugin.INSTANCE.getString("ResponseReferenceRangePatternResponseReferenceRangePatternObservationRangeValue"),
						 new Object [] { eObject }));
				}
				 
			}
			return oclResultSet.isEmpty();
		}
		return true;
	}

} // ResponseReferenceRangePatternOperations
