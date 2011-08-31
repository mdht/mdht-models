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
import org.openhealthtools.mdht.uml.cda.Authenticator;
import org.openhealthtools.mdht.uml.cda.Author;
import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.Component2;
import org.openhealthtools.mdht.uml.cda.Custodian;
import org.openhealthtools.mdht.uml.cda.DataEnterer;
import org.openhealthtools.mdht.uml.cda.InformationRecipient;
import org.openhealthtools.mdht.uml.cda.InfrastructureRootTypeId;
import org.openhealthtools.mdht.uml.cda.LegalAuthenticator;
import org.openhealthtools.mdht.uml.cda.RecordTarget;
import org.openhealthtools.mdht.uml.cda.toc.domain.IAllergiesReactionsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiagnosisSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeDiet;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDischargeSummary;
import org.openhealthtools.mdht.uml.cda.toc.domain.IDomainPackage;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFamilyHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IFunctionalStatusSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHistoryOfPresentIllness;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalCourseSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeMedicationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargePhysical;
import org.openhealthtools.mdht.uml.cda.toc.domain.IHospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IImmunizationsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IPlanOfCareSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IProblemListSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IReviewOfSystemsSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISocialHistorySection;
import org.openhealthtools.mdht.uml.cda.toc.domain.ISurgeriesSection;
import org.openhealthtools.mdht.uml.cda.toc.domain.IVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;
import org.openhealthtools.mdht.uml.hl7.datatypes.CE;
import org.openhealthtools.mdht.uml.hl7.datatypes.CS;
import org.openhealthtools.mdht.uml.hl7.datatypes.II;
import org.openhealthtools.mdht.uml.hl7.datatypes.ST;
import org.openhealthtools.mdht.uml.hl7.datatypes.TS;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Discharge Summary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.toc.domain.impl.DischargeSummaryImpl#getCDAType <em>CDA Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DischargeSummaryImpl extends EObjectImpl implements IDischargeSummary {
	/**
	 * The cached value of the '{@link #getCDAType() <em>CDA Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCDAType()
	 * @generated
	 * @ordered
	 */
	protected ClinicalDocument cDAType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DischargeSummaryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IDomainPackage.eINSTANCE.getDischargeSummary();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalDocument getCDAType() {
		if (cDAType != null && cDAType.eIsProxy()) {
			InternalEObject oldCDAType = (InternalEObject)cDAType;
			cDAType = (ClinicalDocument)eResolveProxy(oldCDAType);
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
	public ClinicalDocument basicGetCDAType() {
		return cDAType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCDAType(ClinicalDocument newCDAType) {
		cDAType = newCDAType;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthors() <em>Get Authors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHORS__EOCL_EXP = "self.getAuthors()->select(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author)).oclAsType(cda::Author)";

	/**
	 * The cached OCL query for the '{@link #getAuthors() <em>Get Authors</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthors()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Author> getAuthors() {
		if (GET_AUTHORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(24));
			try {
				GET_AUTHORS__EOCL_QRY = helper.createQuery(GET_AUTHORS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Author> result = (Collection<Author>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Author>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Author addAuthor() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Author");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Author value = (Author) eObject;
		this.getCDAType().getAuthors().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary addAuthor(Author value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getCustodian() <em>Get Custodian</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CUSTODIAN__EOCL_EXP = "self.getCustodians()->select(custodian : cda::Custodian | not custodian.oclIsUndefined() and custodian.oclIsKindOf(cda::Custodian))->asSequence()->first().oclAsType(cda::Custodian)";

	/**
	 * The cached OCL query for the '{@link #getCustodian() <em>Get Custodian</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustodian()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CUSTODIAN__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian getCustodian() {
		if (GET_CUSTODIAN__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(27));
			try {
				GET_CUSTODIAN__EOCL_QRY = helper.createQuery(GET_CUSTODIAN__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CUSTODIAN__EOCL_QRY);
		return (Custodian) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Custodian withCustodian() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Custodian");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Custodian value = (Custodian) eObject;
		this.getCDAType().setCustodian(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setCustodian(Custodian value) {
		this.getCDAType().setCustodian(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTypeId() <em>Get Type Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TYPE_ID__EOCL_EXP = "self.typeId.oclAsType(cda::InfrastructureRootTypeId)";

	/**
	 * The cached OCL query for the '{@link #getTypeId() <em>Get Type Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TYPE_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId getTypeId() {
		if (GET_TYPE_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(0));
			try {
				GET_TYPE_ID__EOCL_QRY = helper.createQuery(GET_TYPE_ID__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TYPE_ID__EOCL_QRY);
		return (InfrastructureRootTypeId) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfrastructureRootTypeId withTypeId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InfrastructureRootTypeId");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InfrastructureRootTypeId value = (InfrastructureRootTypeId) eObject;
		this.getCDAType().setTypeId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setTypeId(InfrastructureRootTypeId value) {
		this.getCDAType().setTypeId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getId() <em>Get Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ID__EOCL_EXP = "self.id.oclAsType(datatypes::II)";

	/**
	 * The cached OCL query for the '{@link #getId() <em>Get Id</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ID__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II getId() {
		if (GET_ID__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(3));
			try {
				GET_ID__EOCL_QRY = helper.createQuery(GET_ID__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ID__EOCL_QRY);
		return (II) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public II withId() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("II");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		II value = (II) eObject;
		this.getCDAType().setId(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setId(II value) {
		this.getCDAType().setId(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCode() <em>Get Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CODE__EOCL_EXP = "self.code.oclAsType(datatypes::CE)";

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
	public CE getCode() {
		if (GET_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(6));
			try {
				GET_CODE__EOCL_QRY = helper.createQuery(GET_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setCode(CE value) {
		this.getCDAType().setCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_TITLE__EOCL_EXP = "self.title.oclAsType(datatypes::ST)";

	/**
	 * The cached OCL query for the '{@link #getTitle() <em>Get Title</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_TITLE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST getTitle() {
		if (GET_TITLE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(9));
			try {
				GET_TITLE__EOCL_QRY = helper.createQuery(GET_TITLE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_TITLE__EOCL_QRY);
		return (ST) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ST withTitle() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ST");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		ST value = (ST) eObject;
		this.getCDAType().setTitle(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setTitle(ST value) {
		this.getCDAType().setTitle(value);
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
	protected static final String GET_EFFECTIVE_TIME__EOCL_EXP = "self.effectiveTime.oclAsType(datatypes::TS)";

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
	public TS getEffectiveTime() {
		if (GET_EFFECTIVE_TIME__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(12));
			try {
				GET_EFFECTIVE_TIME__EOCL_QRY = helper.createQuery(GET_EFFECTIVE_TIME__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_EFFECTIVE_TIME__EOCL_QRY);
		return (TS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TS withEffectiveTime() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("TS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		TS value = (TS) eObject;
		this.getCDAType().setEffectiveTime(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setEffectiveTime(TS value) {
		this.getCDAType().setEffectiveTime(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONFIDENTIALITY_CODE__EOCL_EXP = "self.confidentialityCode.oclAsType(datatypes::CE)";

	/**
	 * The cached OCL query for the '{@link #getConfidentialityCode() <em>Get Confidentiality Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONFIDENTIALITY_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE getConfidentialityCode() {
		if (GET_CONFIDENTIALITY_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(15));
			try {
				GET_CONFIDENTIALITY_CODE__EOCL_QRY = helper.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONFIDENTIALITY_CODE__EOCL_QRY);
		return (CE) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE withConfidentialityCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CE");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CE value = (CE) eObject;
		this.getCDAType().setConfidentialityCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setConfidentialityCode(CE value) {
		this.getCDAType().setConfidentialityCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getLanguageCode() <em>Get Language Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LANGUAGE_CODE__EOCL_EXP = "self.languageCode.oclAsType(datatypes::CS)";

	/**
	 * The cached OCL query for the '{@link #getLanguageCode() <em>Get Language Code</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguageCode()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LANGUAGE_CODE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS getLanguageCode() {
		if (GET_LANGUAGE_CODE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(18));
			try {
				GET_LANGUAGE_CODE__EOCL_QRY = helper.createQuery(GET_LANGUAGE_CODE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LANGUAGE_CODE__EOCL_QRY);
		return (CS) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CS withLanguageCode() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.hl7.datatypes.DatatypesFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("CS");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		CS value = (CS) eObject;
		this.getCDAType().setLanguageCode(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setLanguageCode(CS value) {
		this.getCDAType().setLanguageCode(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RECORD_TARGETS__EOCL_EXP = "self.getRecordTargets()->select(recordTarget : cda::RecordTarget | not recordTarget.oclIsUndefined() and recordTarget.oclIsKindOf(cda::RecordTarget)).oclAsType(cda::RecordTarget)";

	/**
	 * The cached OCL query for the '{@link #getRecordTargets() <em>Get Record Targets</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordTargets()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RECORD_TARGETS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecordTarget> getRecordTargets() {
		if (GET_RECORD_TARGETS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(21));
			try {
				GET_RECORD_TARGETS__EOCL_QRY = helper.createQuery(GET_RECORD_TARGETS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_RECORD_TARGETS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RecordTarget> result = (Collection<RecordTarget>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<RecordTarget>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordTarget addRecordTarget() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("RecordTarget");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		RecordTarget value = (RecordTarget) eObject;
		this.getCDAType().getRecordTargets().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary addRecordTarget(RecordTarget value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getComponent() <em>Get Component</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMPONENT__EOCL_EXP = "self.getComponent2s()->select(component2 : cda::Component2 | not component2.oclIsUndefined() and component2.oclIsKindOf(cda::Component2))->asSequence()->first().oclAsType(cda::Component2)";

	/**
	 * The cached OCL query for the '{@link #getComponent() <em>Get Component</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMPONENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 getComponent() {
		if (GET_COMPONENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(30));
			try {
				GET_COMPONENT__EOCL_QRY = helper.createQuery(GET_COMPONENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMPONENT__EOCL_QRY);
		return (Component2) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component2 withComponent() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Component2");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Component2 value = (Component2) eObject;
		this.getCDAType().setComponent(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setComponent(Component2 value) {
		this.getCDAType().setComponent(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DATA_ENTERER__EOCL_EXP = "self.getDataEnterers()->select(dataEnterer : cda::DataEnterer | not dataEnterer.oclIsUndefined() and dataEnterer.oclIsKindOf(cda::DataEnterer))->asSequence()->first().oclAsType(cda::DataEnterer)";

	/**
	 * The cached OCL query for the '{@link #getDataEnterer() <em>Get Data Enterer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataEnterer()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DATA_ENTERER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer getDataEnterer() {
		if (GET_DATA_ENTERER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(33));
			try {
				GET_DATA_ENTERER__EOCL_QRY = helper.createQuery(GET_DATA_ENTERER__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DATA_ENTERER__EOCL_QRY);
		return (DataEnterer) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataEnterer withDataEnterer() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DataEnterer");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		DataEnterer value = (DataEnterer) eObject;
		this.getCDAType().setDataEnterer(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setDataEnterer(DataEnterer value) {
		this.getCDAType().setDataEnterer(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFORMATION_RECIPIENTS__EOCL_EXP = "self.getInformationRecipients()->select(informationRecipient : cda::InformationRecipient | not informationRecipient.oclIsUndefined() and informationRecipient.oclIsKindOf(cda::InformationRecipient)).oclAsType(cda::InformationRecipient)";

	/**
	 * The cached OCL query for the '{@link #getInformationRecipients() <em>Get Information Recipients</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformationRecipients()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFORMATION_RECIPIENTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InformationRecipient> getInformationRecipients() {
		if (GET_INFORMATION_RECIPIENTS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(36));
			try {
				GET_INFORMATION_RECIPIENTS__EOCL_QRY = helper.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFORMATION_RECIPIENTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<InformationRecipient> result = (Collection<InformationRecipient>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<InformationRecipient>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformationRecipient addInformationRecipient() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("InformationRecipient");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		InformationRecipient value = (InformationRecipient) eObject;
		this.getCDAType().getInformationRecipients().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary addInformationRecipient(InformationRecipient value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_LEGAL_AUTHENTICATOR__EOCL_EXP = "self.getLegalAuthenticators()->select(legalAuthenticator : cda::LegalAuthenticator | not legalAuthenticator.oclIsUndefined() and legalAuthenticator.oclIsKindOf(cda::LegalAuthenticator))->asSequence()->first().oclAsType(cda::LegalAuthenticator)";

	/**
	 * The cached OCL query for the '{@link #getLegalAuthenticator() <em>Get Legal Authenticator</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalAuthenticator()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_LEGAL_AUTHENTICATOR__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator getLegalAuthenticator() {
		if (GET_LEGAL_AUTHENTICATOR__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(39));
			try {
				GET_LEGAL_AUTHENTICATOR__EOCL_QRY = helper.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_LEGAL_AUTHENTICATOR__EOCL_QRY);
		return (LegalAuthenticator) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalAuthenticator withLegalAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("LegalAuthenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		LegalAuthenticator value = (LegalAuthenticator) eObject;
		this.getCDAType().setLegalAuthenticator(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setLegalAuthenticator(LegalAuthenticator value) {
		this.getCDAType().setLegalAuthenticator(value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTHENTICATORS__EOCL_EXP = "self.getAuthenticators()->select(authenticator : cda::Authenticator | not authenticator.oclIsUndefined() and authenticator.oclIsKindOf(cda::Authenticator)).oclAsType(cda::Authenticator)";

	/**
	 * The cached OCL query for the '{@link #getAuthenticators() <em>Get Authenticators</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthenticators()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTHENTICATORS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Authenticator> getAuthenticators() {
		if (GET_AUTHENTICATORS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(42));
			try {
				GET_AUTHENTICATORS__EOCL_QRY = helper.createQuery(GET_AUTHENTICATORS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_AUTHENTICATORS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Authenticator> result = (Collection<Authenticator>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Authenticator>(result.size(), result.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Authenticator addAuthenticator() {
		org.eclipse.emf.ecore.EPackage ePackage = org.openhealthtools.mdht.uml.cda.CDAPackage.eINSTANCE;
		org.eclipse.emf.ecore.EFactory eFactory = org.openhealthtools.mdht.uml.cda.CDAFactory.eINSTANCE;
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("Authenticator");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		Authenticator value = (Authenticator) eObject;
		this.getCDAType().getAuthenticators().add(value);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary addAuthenticator(Authenticator value) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * The cached OCL expression body for the '{@link #getAllergies() <em>Get Allergies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergies()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ALLERGIES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::AllergiesReactionsSection))->asSequence()->first().oclAsType(domain::AllergiesReactionsSection)";

	/**
	 * The cached OCL query for the '{@link #getAllergies() <em>Get Allergies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllergies()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ALLERGIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection getAllergies() {
		if (GET_ALLERGIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(45));
			try {
				GET_ALLERGIES__EOCL_QRY = helper.createQuery(GET_ALLERGIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES__EOCL_QRY);
		return (IAllergiesReactionsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IAllergiesReactionsSection withAllergies() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("AllergiesReactionsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("AllergiesReactionsSection");
		IAllergiesReactionsSection value = (IAllergiesReactionsSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setAllergies(IAllergiesReactionsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getActiveProblems() <em>Get Active Problems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblems()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ACTIVE_PROBLEMS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ProblemListSection))->asSequence()->first().oclAsType(domain::ProblemListSection)";

	/**
	 * The cached OCL query for the '{@link #getActiveProblems() <em>Get Active Problems</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveProblems()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ACTIVE_PROBLEMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection getActiveProblems() {
		if (GET_ACTIVE_PROBLEMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(48));
			try {
				GET_ACTIVE_PROBLEMS__EOCL_QRY = helper.createQuery(GET_ACTIVE_PROBLEMS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ACTIVE_PROBLEMS__EOCL_QRY);
		return (IProblemListSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProblemListSection withActiveProblems() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ProblemListSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ProblemListSection");
		IProblemListSection value = (IProblemListSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setActiveProblems(IProblemListSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalCourse() <em>Get Hospital Course</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourse()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_COURSE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalCourseSection))->asSequence()->first().oclAsType(domain::HospitalCourseSection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalCourse() <em>Get Hospital Course</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalCourse()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_COURSE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalCourseSection getHospitalCourse() {
		if (GET_HOSPITAL_COURSE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(51));
			try {
				GET_HOSPITAL_COURSE__EOCL_QRY = helper.createQuery(GET_HOSPITAL_COURSE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_COURSE__EOCL_QRY);
		return (IHospitalCourseSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalCourseSection withHospitalCourse() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HospitalCourseSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HospitalCourseSection");
		IHospitalCourseSection value = (IHospitalCourseSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setHospitalCourse(IHospitalCourseSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeMeds() <em>Get Discharge Meds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMeds()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_MEDS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargeMedicationsSection))->asSequence()->first().oclAsType(domain::HospitalDischargeMedicationsSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeMeds() <em>Get Discharge Meds</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeMeds()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_MEDS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeMedicationsSection getDischargeMeds() {
		if (GET_DISCHARGE_MEDS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(54));
			try {
				GET_DISCHARGE_MEDS__EOCL_QRY = helper.createQuery(GET_DISCHARGE_MEDS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_MEDS__EOCL_QRY);
		return (IHospitalDischargeMedicationsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeMedicationsSection withDischargeMeds() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HospitalDischargeMedicationsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HospitalDischargeMedicationsSection");
		IHospitalDischargeMedicationsSection value = (IHospitalDischargeMedicationsSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setDischargeMeds(IHospitalDischargeMedicationsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiagnosis() <em>Get Discharge Diagnosis</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIAGNOSIS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiagnosisSection))->asSequence()->first().oclAsType(domain::DischargeDiagnosisSection)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiagnosis() <em>Get Discharge Diagnosis</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiagnosis()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIAGNOSIS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection getDischargeDiagnosis() {
		if (GET_DISCHARGE_DIAGNOSIS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(57));
			try {
				GET_DISCHARGE_DIAGNOSIS__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIAGNOSIS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIAGNOSIS__EOCL_QRY);
		return (IDischargeDiagnosisSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiagnosisSection withDischargeDiagnosis() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DischargeDiagnosisSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("DischargeDiagnosisSection");
		IDischargeDiagnosisSection value = (IDischargeDiagnosisSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setDischargeDiagnosis(IDischargeDiagnosisSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlanOfCare() <em>Get Plan Of Care</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCare()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLAN_OF_CARE__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::PlanOfCareSection))->asSequence()->first().oclAsType(domain::PlanOfCareSection)";

	/**
	 * The cached OCL query for the '{@link #getPlanOfCare() <em>Get Plan Of Care</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanOfCare()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLAN_OF_CARE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection getPlanOfCare() {
		if (GET_PLAN_OF_CARE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(60));
			try {
				GET_PLAN_OF_CARE__EOCL_QRY = helper.createQuery(GET_PLAN_OF_CARE__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLAN_OF_CARE__EOCL_QRY);
		return (IPlanOfCareSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPlanOfCareSection withPlanOfCare() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("PlanOfCareSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("PlanOfCareSection");
		IPlanOfCareSection value = (IPlanOfCareSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setPlanOfCare(IPlanOfCareSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSurgeries() <em>Get Surgeries</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeries()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SURGERIES__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::SurgeriesSection))->asSequence()->first().oclAsType(domain::SurgeriesSection)";

	/**
	 * The cached OCL query for the '{@link #getSurgeries() <em>Get Surgeries</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurgeries()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SURGERIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection getSurgeries() {
		if (GET_SURGERIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(63));
			try {
				GET_SURGERIES__EOCL_QRY = helper.createQuery(GET_SURGERIES__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SURGERIES__EOCL_QRY);
		return (ISurgeriesSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISurgeriesSection withSurgeries() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("SurgeriesSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("SurgeriesSection");
		ISurgeriesSection value = (ISurgeriesSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setSurgeries(ISurgeriesSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getChiefComplaint() <em>Get Chief Complaint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaint()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CHIEF_COMPLAINT__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ChiefComplaintSection))->asSequence()->first().oclAsType(domain::ChiefComplaintSection)";

	/**
	 * The cached OCL query for the '{@link #getChiefComplaint() <em>Get Chief Complaint</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChiefComplaint()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CHIEF_COMPLAINT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChiefComplaintSection getChiefComplaint() {
		if (GET_CHIEF_COMPLAINT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(66));
			try {
				GET_CHIEF_COMPLAINT__EOCL_QRY = helper.createQuery(GET_CHIEF_COMPLAINT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CHIEF_COMPLAINT__EOCL_QRY);
		return (IChiefComplaintSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IChiefComplaintSection withChiefComplaint() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ChiefComplaintSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ChiefComplaintSection");
		IChiefComplaintSection value = (IChiefComplaintSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setChiefComplaint(IChiefComplaintSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getDischargeDiet() <em>Get Discharge Diet</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiet()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_DISCHARGE_DIET__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::DischargeDiet))->asSequence()->first().oclAsType(domain::DischargeDiet)";

	/**
	 * The cached OCL query for the '{@link #getDischargeDiet() <em>Get Discharge Diet</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDischargeDiet()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_DISCHARGE_DIET__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiet getDischargeDiet() {
		if (GET_DISCHARGE_DIET__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(69));
			try {
				GET_DISCHARGE_DIET__EOCL_QRY = helper.createQuery(GET_DISCHARGE_DIET__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_DISCHARGE_DIET__EOCL_QRY);
		return (IDischargeDiet) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeDiet withDischargeDiet() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("DischargeDiet");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("DischargeDiet");
		IDischargeDiet value = (IDischargeDiet)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setDischargeDiet(IDischargeDiet value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFamilyHistory() <em>Get Family History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FAMILY_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::FamilyHistorySection))->asSequence()->first().oclAsType(domain::FamilyHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getFamilyHistory() <em>Get Family History</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamilyHistory()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FAMILY_HISTORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection getFamilyHistory() {
		if (GET_FAMILY_HISTORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(72));
			try {
				GET_FAMILY_HISTORY__EOCL_QRY = helper.createQuery(GET_FAMILY_HISTORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FAMILY_HISTORY__EOCL_QRY);
		return (IFamilyHistorySection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFamilyHistorySection withFamilyHistory() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("FamilyHistorySection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("FamilyHistorySection");
		IFamilyHistorySection value = (IFamilyHistorySection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setFamilyHistory(IFamilyHistorySection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getFunctionalStatus() <em>Get Functional Status</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FUNCTIONAL_STATUS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::FunctionalStatusSection))->asSequence()->first().oclAsType(domain::FunctionalStatusSection)";

	/**
	 * The cached OCL query for the '{@link #getFunctionalStatus() <em>Get Functional Status</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalStatus()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FUNCTIONAL_STATUS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection getFunctionalStatus() {
		if (GET_FUNCTIONAL_STATUS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(75));
			try {
				GET_FUNCTIONAL_STATUS__EOCL_QRY = helper.createQuery(GET_FUNCTIONAL_STATUS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_FUNCTIONAL_STATUS__EOCL_QRY);
		return (IFunctionalStatusSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFunctionalStatusSection withFunctionalStatus() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("FunctionalStatusSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("FunctionalStatusSection");
		IFunctionalStatusSection value = (IFunctionalStatusSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setFunctionalStatus(IFunctionalStatusSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HistoryOfPresentIllness))->asSequence()->first().oclAsType(domain::HistoryOfPresentIllness)";

	/**
	 * The cached OCL query for the '{@link #getHistoryOfPresentIllness() <em>Get History Of Present Illness</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistoryOfPresentIllness()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPresentIllness getHistoryOfPresentIllness() {
		if (GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(78));
			try {
				GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY = helper.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HISTORY_OF_PRESENT_ILLNESS__EOCL_QRY);
		return (IHistoryOfPresentIllness) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHistoryOfPresentIllness withHistoryOfPresentIllness() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HistoryOfPresentIllness");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HistoryOfPresentIllness");
		IHistoryOfPresentIllness value = (IHistoryOfPresentIllness)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setHistoryOfPresentIllness(IHistoryOfPresentIllness value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargePhysical() <em>Get Hospital Discharge Physical</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysical()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargePhysical))->asSequence()->first().oclAsType(domain::HospitalDischargePhysical)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargePhysical() <em>Get Hospital Discharge Physical</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargePhysical()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargePhysical getHospitalDischargePhysical() {
		if (GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(81));
			try {
				GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_PHYSICAL__EOCL_QRY);
		return (IHospitalDischargePhysical) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargePhysical withHospitalDischargePhysical() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/ihe");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HospitalDischargePhysical");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HospitalDischargePhysical");
		IHospitalDischargePhysical value = (IHospitalDischargePhysical)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setHospitalDischargePhysical(IHospitalDischargePhysical value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHospitalDischargeStudiesSummary() <em>Get Hospital Discharge Studies Summary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::HospitalDischargeStudiesSummarySection))->asSequence()->first().oclAsType(domain::HospitalDischargeStudiesSummarySection)";

	/**
	 * The cached OCL query for the '{@link #getHospitalDischargeStudiesSummary() <em>Get Hospital Discharge Studies Summary</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHospitalDischargeStudiesSummary()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeStudiesSummarySection getHospitalDischargeStudiesSummary() {
		if (GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(84));
			try {
				GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_QRY = helper.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_HOSPITAL_DISCHARGE_STUDIES_SUMMARY__EOCL_QRY);
		return (IHospitalDischargeStudiesSummarySection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IHospitalDischargeStudiesSummarySection withHospitalDischargeStudiesSummary() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/cdt");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/cdt");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("HospitalDischargeStudiesSummarySection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("HospitalDischargeStudiesSummarySection");
		IHospitalDischargeStudiesSummarySection value = (IHospitalDischargeStudiesSummarySection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setHospitalDischargeStudiesSummary(IHospitalDischargeStudiesSummarySection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getImmunizations() <em>Get Immunizations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_IMMUNIZATIONS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ImmunizationsSection))->asSequence()->first().oclAsType(domain::ImmunizationsSection)";

	/**
	 * The cached OCL query for the '{@link #getImmunizations() <em>Get Immunizations</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmunizations()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_IMMUNIZATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection getImmunizations() {
		if (GET_IMMUNIZATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(87));
			try {
				GET_IMMUNIZATIONS__EOCL_QRY = helper.createQuery(GET_IMMUNIZATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_IMMUNIZATIONS__EOCL_QRY);
		return (IImmunizationsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IImmunizationsSection withImmunizations() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ImmunizationsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ImmunizationsSection");
		IImmunizationsSection value = (IImmunizationsSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setImmunizations(IImmunizationsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getReviewOfSystems() <em>Get Review Of Systems</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystems()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_REVIEW_OF_SYSTEMS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::ReviewOfSystemsSection))->asSequence()->first().oclAsType(domain::ReviewOfSystemsSection)";

	/**
	 * The cached OCL query for the '{@link #getReviewOfSystems() <em>Get Review Of Systems</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReviewOfSystems()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_REVIEW_OF_SYSTEMS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewOfSystemsSection getReviewOfSystems() {
		if (GET_REVIEW_OF_SYSTEMS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(90));
			try {
				GET_REVIEW_OF_SYSTEMS__EOCL_QRY = helper.createQuery(GET_REVIEW_OF_SYSTEMS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_REVIEW_OF_SYSTEMS__EOCL_QRY);
		return (IReviewOfSystemsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IReviewOfSystemsSection withReviewOfSystems() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("ReviewOfSystemsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("ReviewOfSystemsSection");
		IReviewOfSystemsSection value = (IReviewOfSystemsSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setReviewOfSystems(IReviewOfSystemsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getSocialHistory() <em>Get Social History</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistory()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_SOCIAL_HISTORY__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::SocialHistorySection))->asSequence()->first().oclAsType(domain::SocialHistorySection)";

	/**
	 * The cached OCL query for the '{@link #getSocialHistory() <em>Get Social History</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSocialHistory()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_SOCIAL_HISTORY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection getSocialHistory() {
		if (GET_SOCIAL_HISTORY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(93));
			try {
				GET_SOCIAL_HISTORY__EOCL_QRY = helper.createQuery(GET_SOCIAL_HISTORY__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_SOCIAL_HISTORY__EOCL_QRY);
		return (ISocialHistorySection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ISocialHistorySection withSocialHistory() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("SocialHistorySection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("SocialHistorySection");
		ISocialHistorySection value = (ISocialHistorySection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setSocialHistory(ISocialHistorySection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSigns() <em>Get Vital Signs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSigns()
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(domain::VitalSignsSection))->asSequence()->first().oclAsType(domain::VitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getVitalSigns() <em>Get Vital Signs</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSigns()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection getVitalSigns() {
		if (GET_VITAL_SIGNS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(IDomainPackage.eINSTANCE.getDischargeSummary(), IDomainPackage.eINSTANCE.getDischargeSummary().getEAllOperations().get(96));
			try {
				GET_VITAL_SIGNS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_VITAL_SIGNS__EOCL_QRY);
		return (IVitalSignsSection) query.evaluate(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IVitalSignsSection withVitalSigns() {
		org.eclipse.emf.ecore.EPackage ePackage = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEPackage("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EFactory eFactory = org.eclipse.emf.ecore.EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/hitsp");
		org.eclipse.emf.ecore.EClass eClass = (org.eclipse.emf.ecore.EClass) ePackage.getEClassifier("VitalSignsSection");
		org.eclipse.emf.ecore.EObject eObject = eFactory.create(eClass);
		try {
			java.lang.reflect.Method initMethod = eObject.getClass().getMethod("init", new java.lang.Class[0]);
			initMethod.invoke(eObject, new Object[0]);
		} catch (Exception e) {
			// no init() method
		}
		org.eclipse.emf.ecore.EPackage domainPackage = this.eClass().getEPackage();
		org.eclipse.emf.ecore.EFactory domainFactory = domainPackage.getEFactoryInstance();
		org.eclipse.emf.ecore.EClass domainEClass = (org.eclipse.emf.ecore.EClass) domainPackage.getEClassifier("VitalSignsSection");
		IVitalSignsSection value = (IVitalSignsSection)domainFactory.create(domainEClass);
		value.setCDAType((org.openhealthtools.mdht.uml.cda.Section)eObject);
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)eObject);
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IDischargeSummary setVitalSigns(IVitalSignsSection value) {
		this.getCDAType().addSection((org.openhealthtools.mdht.uml.cda.Section)value);
		return this;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IDomainPackage.DISCHARGE_SUMMARY__CDA_TYPE:
				if (resolve) return getCDAType();
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
			case IDomainPackage.DISCHARGE_SUMMARY__CDA_TYPE:
				setCDAType((ClinicalDocument)newValue);
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
			case IDomainPackage.DISCHARGE_SUMMARY__CDA_TYPE:
				setCDAType((ClinicalDocument)null);
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
			case IDomainPackage.DISCHARGE_SUMMARY__CDA_TYPE:
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
	public IDischargeSummary init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DischargeSummaryImpl
