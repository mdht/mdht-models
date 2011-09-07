/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.toc.domain.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.Consumable;
import org.openhealthtools.mdht.uml.cda.Performer2;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunization;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationSeriesNumberObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IMedicationStatusObservation;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPatientInstruction;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProductInstance;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReactionObservation;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CD;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.IVL_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.RTO_PQ_PQ;
import org.openhealthtools.mdht.uml.hl7.datatypes.SXCM_TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Immunization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.ImmunizationImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImmunizationImpl extends EObjectImpl implements IImmunization {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected SubstanceAdministration cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImmunizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getImmunization();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdministration getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject) cDAType;
			cDAType = (SubstanceAdministration) eResolveProxy(oldCDAType);
			if (cDAType != oldCDAType) {
			}
		}
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstanceAdministration basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(SubstanceAdministration newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getIds() <em>Get Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IDS__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getIds() <em>Get Ids</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIds()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<II> getIds() {
		if (GET_IDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(0));
			try {
				GET_IDS__EOCL_QRY = helper.createQuery(GET_IDS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IDS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<II> result = (Collection<II>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<II>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II addId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		this.getCDAType().getIds().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addId(II value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CD)";

	/**
	 * The cached OCL query for the '{@link #getCode() <em>Get Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD getCode() {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(3));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CD) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD withCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setCode(CD value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getStatusCode() <em>Get Status Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_STATUS_CODE__EOCL_EXP = "self.statusCode.oclAsType(datatypes::CS)";

	/**
	 * The cached OCL query for the '{@link #getStatusCode() <em>Get Status Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatusCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_STATUS_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getStatusCode() {
		if (GET_STATUS_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(6));
			try {
				GET_STATUS_CODE__EOCL_QRY = helper.createQuery(GET_STATUS_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_STATUS_CODE__EOCL_QRY);
		return (CS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS withStatusCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CS value = (CS) eObject;
		this.getCDAType().setStatusCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setStatusCode(CS value) {
		this.getCDAType().setStatusCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::SXCM_TS)";

	/**
	 * The cached OCL query for the '{@link #getEffectiveTime() <em>Get Effective Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveTime()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_EFFECTIVE_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SXCM_TS getEffectiveTime() {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(9));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (SXCM_TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SXCM_TS withEffectiveTime() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("SXCM_TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		SXCM_TS value = (SXCM_TS) eObject;
		this.getCDAType().getEffectiveTimes().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setEffectiveTime(SXCM_TS value) {
		this.getCDAType().getEffectiveTimes().add(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRouteCode() <em>Get Route Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ROUTE_CODE__EOCL_EXP = "self.routeCode.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getRouteCode() <em>Get Route Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ROUTE_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getRouteCode() {
		if (GET_ROUTE_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(12));
			try {
				GET_ROUTE_CODE__EOCL_QRY = helper.createQuery(GET_ROUTE_CODE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ROUTE_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withRouteCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setRouteCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setRouteCode(CE value) {
		this.getCDAType().setRouteCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getApproachSiteCodes() <em>Get Approach Site Codes</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachSiteCodes()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_APPROACH_SITE_CODES__EOCL_EXP = "self.approachSiteCode.oclAsType(datatypes::CD)";

	/**
	 * The cached OCL query for the '{@link #getApproachSiteCodes() <em>Get Approach Site Codes</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApproachSiteCodes()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_APPROACH_SITE_CODES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CD> getApproachSiteCodes() {
		if (GET_APPROACH_SITE_CODES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(15));
			try {
				GET_APPROACH_SITE_CODES__EOCL_QRY = helper.createQuery(GET_APPROACH_SITE_CODES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_APPROACH_SITE_CODES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CD> result = (Collection<CD>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<CD>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CD addApproachSiteCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CD");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CD value = (CD) eObject;
		this.getCDAType().getApproachSiteCodes().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addApproachSiteCode(CD value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getDoseQuantity() <em>Get Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DOSE_QUANTITY__EOCL_EXP = "self.doseQuantity.oclAsType(datatypes::IVL_PQ)";

	/**
	 * The cached OCL query for the '{@link #getDoseQuantity() <em>Get Dose Quantity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DOSE_QUANTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ getDoseQuantity() {
		if (GET_DOSE_QUANTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(18));
			try {
				GET_DOSE_QUANTITY__EOCL_QRY = helper.createQuery(GET_DOSE_QUANTITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DOSE_QUANTITY__EOCL_QRY);
		return (IVL_PQ) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ withDoseQuantity() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_PQ");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IVL_PQ value = (IVL_PQ) eObject;
		this.getCDAType().setDoseQuantity(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setDoseQuantity(IVL_PQ value) {
		this.getCDAType().setDoseQuantity(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRateQuantity() <em>Get Rate Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RATE_QUANTITY__EOCL_EXP = "self.rateQuantity.oclAsType(datatypes::IVL_PQ)";

	/**
	 * The cached OCL query for the '{@link #getRateQuantity() <em>Get Rate Quantity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRateQuantity()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RATE_QUANTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ getRateQuantity() {
		if (GET_RATE_QUANTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(21));
			try {
				GET_RATE_QUANTITY__EOCL_QRY = helper.createQuery(GET_RATE_QUANTITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RATE_QUANTITY__EOCL_QRY);
		return (IVL_PQ) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVL_PQ withRateQuantity() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("IVL_PQ");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		IVL_PQ value = (IVL_PQ) eObject;
		this.getCDAType().setRateQuantity(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setRateQuantity(IVL_PQ value) {
		this.getCDAType().setRateQuantity(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMaxDoseQuantity() <em>Get Max Dose Quantity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MAX_DOSE_QUANTITY__EOCL_EXP = "self.maxDoseQuantity.oclAsType(datatypes::RTO_PQ_PQ)";

	/**
	 * The cached OCL query for the '{@link #getMaxDoseQuantity() <em>Get Max Dose Quantity</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDoseQuantity()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MAX_DOSE_QUANTITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO_PQ_PQ getMaxDoseQuantity() {
		if (GET_MAX_DOSE_QUANTITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(24));
			try {
				GET_MAX_DOSE_QUANTITY__EOCL_QRY = helper.createQuery(GET_MAX_DOSE_QUANTITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MAX_DOSE_QUANTITY__EOCL_QRY);
		return (RTO_PQ_PQ) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RTO_PQ_PQ withMaxDoseQuantity() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RTO_PQ_PQ");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		RTO_PQ_PQ value = (RTO_PQ_PQ) eObject;
		this.getCDAType().setMaxDoseQuantity(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setMaxDoseQuantity(RTO_PQ_PQ value) {
		this.getCDAType().setMaxDoseQuantity(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsumable() <em>Get Consumable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumable()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSUMABLE__EOCL_EXP = "self.getConsumables()->select(consumable : cda::Consumable | not consumable.oclIsUndefined() and consumable.oclIsKindOf(cda::Consumable))->asSequence()->first().oclAsType(cda::Consumable)";

	/**
	 * The cached OCL query for the '{@link #getConsumable() <em>Get Consumable</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumable()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSUMABLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumable getConsumable() {
		if (GET_CONSUMABLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(27));
			try {
				GET_CONSUMABLE__EOCL_QRY = helper.createQuery(GET_CONSUMABLE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSUMABLE__EOCL_QRY);
		return (Consumable) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Consumable withConsumable() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Consumable");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Consumable value = (Consumable) eObject;
		this.getCDAType().setConsumable(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setConsumable(Consumable value) {
		this.getCDAType().setConsumable(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationSeriesNumberObservation))->asSequence()->first().oclAsType(domain::MedicationSeriesNumberObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationSeriesNumberObservation() <em>Get Medication Series Number Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationSeriesNumberObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSeriesNumberObservation getMedicationSeriesNumberObservation() {
		if (GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(30));
			try {
				GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_SERIES_NUMBER_OBSERVATION__EOCL_QRY);
		return (IMedicationSeriesNumberObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationSeriesNumberObservation withMedicationSeriesNumberObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationSeriesNumberObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationSeriesNumberObservation");
		IMedicationSeriesNumberObservation value = (IMedicationSeriesNumberObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setMedicationSeriesNumberObservation(IMedicationSeriesNumberObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getMedicationStatusObservation() <em>Get Medication Status Observation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::MedicationStatusObservation))->asSequence()->first().oclAsType(domain::MedicationStatusObservation)";

	/**
	 * The cached OCL query for the '{@link #getMedicationStatusObservation() <em>Get Medication Status Observation</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicationStatusObservation()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationStatusObservation getMedicationStatusObservation() {
		if (GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(33));
			try {
				GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_STATUS_OBSERVATION__EOCL_QRY);
		return (IMedicationStatusObservation) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IMedicationStatusObservation withMedicationStatusObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("MedicationStatusObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("MedicationStatusObservation");
		IMedicationStatusObservation value = (IMedicationStatusObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization setMedicationStatusObservation(IMedicationStatusObservation value) {
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPatientInstructions() <em>Get Patient Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PATIENT_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(domain::PatientInstruction)).oclAsType(domain::PatientInstruction)";

	/**
	 * The cached OCL query for the '{@link #getPatientInstructions() <em>Get Patient Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientInstructions()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PATIENT_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IPatientInstruction> getPatientInstructions() {
		if (GET_PATIENT_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(36));
			try {
				GET_PATIENT_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PATIENT_INSTRUCTIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IPatientInstruction> result = (Collection<IPatientInstruction>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IPatientInstruction>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPatientInstruction addPatientInstruction() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PatientInstruction");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PatientInstruction");
		IPatientInstruction value = (IPatientInstruction) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Act) eObject);
		this.getCDAType().addAct((org.openhealthtools.mdht.uml.cda.Act) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addPatientInstruction(IPatientInstruction value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getPerformers() <em>Get Performers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PERFORMERS__EOCL_EXP = "self.getPerformer2s()->select(performer2 : cda::Performer2 | not performer2.oclIsUndefined() and performer2.oclIsKindOf(cda::Performer2)).oclAsType(cda::Performer2)";

	/**
	 * The cached OCL query for the '{@link #getPerformers() <em>Get Performers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformers()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PERFORMERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performer2> getPerformers() {
		if (GET_PERFORMERS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(39));
			try {
				GET_PERFORMERS__EOCL_QRY = helper.createQuery(GET_PERFORMERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PERFORMERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Performer2> result = (Collection<Performer2>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Performer2>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performer2 addPerformer() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Performer2");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Performer2 value = (Performer2) eObject;
		this.getCDAType().getPerformers().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addPerformer(Performer2 value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getReactionObservations() <em>Get Reaction Observations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REACTION_OBSERVATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(domain::ReactionObservation)).oclAsType(domain::ReactionObservation)";

	/**
	 * The cached OCL query for the '{@link #getReactionObservations() <em>Get Reaction Observations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactionObservations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REACTION_OBSERVATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IReactionObservation> getReactionObservations() {
		if (GET_REACTION_OBSERVATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(42));
			try {
				GET_REACTION_OBSERVATIONS__EOCL_QRY = helper.createQuery(GET_REACTION_OBSERVATIONS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REACTION_OBSERVATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IReactionObservation> result = (Collection<IReactionObservation>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IReactionObservation>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReactionObservation addReactionObservation() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ccd");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ReactionObservation");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ReactionObservation");
		IReactionObservation value = (IReactionObservation) domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		this.getCDAType().addObservation((org.openhealthtools.mdht.uml.cda.Observation) eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addReactionObservation(IReactionObservation value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getProductInstances() <em>Get Product Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PRODUCT_INSTANCES__EOCL_EXP = "self.getParticipantRoles()->select(participantRole : cda::ParticipantRole | not participantRole.oclIsUndefined() and participantRole.oclIsKindOf(domain::ProductInstance)).oclAsType(domain::ProductInstance)";

	/**
	 * The cached OCL query for the '{@link #getProductInstances() <em>Get Product Instances</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductInstances()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PRODUCT_INSTANCES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IProductInstance> getProductInstances() {
		if (GET_PRODUCT_INSTANCES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				IDomainPackage.eINSTANCE.getImmunization(),
				IDomainPackage.eINSTANCE.getImmunization().getEAllOperations().get(45));
			try {
				GET_PRODUCT_INSTANCES__EOCL_QRY = helper.createQuery(GET_PRODUCT_INSTANCES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PRODUCT_INSTANCES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<IProductInstance> result = (Collection<IProductInstance>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<IProductInstance>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProductInstance addProductInstance() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization addProductInstance(IProductInstance value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.IMMUNIZATION__CDA_TYPE:
				if (resolve) {
					return getCDAType();
				}
				return basicGetCDAType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IDomainPackage.IMMUNIZATION__CDA_TYPE:
				setCDAType((SubstanceAdministration) newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IDomainPackage.IMMUNIZATION__CDA_TYPE:
				setCDAType((SubstanceAdministration) null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IDomainPackage.IMMUNIZATION__CDA_TYPE:
				return cDAType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunization init() {
		CDAUtil.init(this);
		return this;
	}
} // ImmunizationImpl
